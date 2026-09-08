package ride;

import client.IClient;
import discount.DiscountHandler;
import discount.Discounts;
import vehicle.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RideOrderManager {

    private final Comparator<IVehicle> priorityAnyVehicleRequest = (vehicle1, vehicle2) -> vehicle1.getPassengerLimit() - vehicle2.getPassengerLimit();
    private final ArrayList<Discounts> discountPolicy = new ArrayList<>(List.of(Discounts.MEMBER_DISCOUNT));
    private final IVehiclesCollection vehicles;

    public RideOrderManager(IVehiclesCollection vehicles){
        this.vehicles = vehicles;
    }

    public IVehiclesCollection getVehicles() {
        return vehicles;
    }

    public Ride assignRide(IRideRequest rideRequest, String driver){
        Ride ride = new Ride(
                driver,
                vehicles.getAvailableVehicle(rideRequest.requestedVehicle(), rideRequest.passengerCount(), priorityAnyVehicleRequest),
                rideRequest.passengerCount(),
                rideRequest.km(),
                rideRequest.client()
        );
        System.out.println(assignRideText(rideRequest, ride, vehicles));
        return ride;
    }

     private double getDiscount(Ride ride, IClient client){
        return DiscountHandler.calculateDiscount(ride, client.getDiscounts(), discountPolicy);
     }

     public double getTotalPrice(Ride ride){
        return ride.getPrice() - DiscountHandler.calculateDiscount(ride, ride.getClient().getDiscounts(), discountPolicy);
     }

    private String assignRideText(IRideRequest rideRequest, Ride ride, IVehiclesCollection vehicles){
        return rideRequest + "\n\n" +
                "Available Vehicles:\n" +
                vehicles +"\n\n" +
                "Result:\n" +
                ride.getVehicle().toString() + " assigned";
    }
}
