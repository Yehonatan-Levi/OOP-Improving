package ride;

import vehicle.*;

import java.util.Comparator;

public class RideManager {

    private final Comparator<IVehicle> priorityAnyVehicleRequest = (vehicle1, vehicle2) -> vehicle1.getPassengerLimit() - vehicle2.getPassengerLimit();
    private final IVehiclesCollection vehicles;

    public RideManager (IVehiclesCollection vehicles){
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
                rideRequest.km()
        );
        System.out.println(assignRideText(rideRequest, ride, vehicles));
        return ride;
    }

    private String assignRideText(IRideRequest rideRequest, Ride ride, IVehiclesCollection vehicles){
        return rideRequest + "\n\n" +
                "Available Vehicles:\n" +
                vehicles +"\n\n" +
                "Result:\n" +
                ride.getVehicle().toString() + " assigned";
    }
}
