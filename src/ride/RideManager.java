package ride;

import vehicle.*;
import vehicle.Factory.VehicleTypes;
import vehicle.Factory.VehiclesRepository;

import java.util.ArrayList;
import java.util.Comparator;

public class RideManager {

    private final Comparator<IVehicle> priorityAnyVehicleRequest = (vehicle1, vehicle2) -> vehicle1.getPassengerLimit() - vehicle2.getPassengerLimit();
    private final VehiclesRepository vehicles;

    public RideManager (VehiclesRepository vehicles){
        this.vehicles = vehicles;
    }

    public VehiclesRepository getVehicles() {
        return vehicles;
    }

    public Ride assignRide(RideRequest rideRequest, String driver){
        Ride ride = new Ride(
                driver,
                vehicles.getAvailableVehicle(rideRequest.getRequestedVehicle(), rideRequest.getPassengerCount(), priorityAnyVehicleRequest),
                rideRequest.getPassengerCount()
        );
        System.out.println(assignRideText(rideRequest, ride, vehicles));
        return ride;
    }

    private String assignRideText(RideRequest rideRequest, Ride ride, VehiclesRepository vehicles){
        return rideRequest + "\n\n" +
                "Available Vehicles:\n" +
                vehicles +"\n\n" +
                "Result:\n" +
                ride.getVehicle().toString() + " assigned";
    }
}
