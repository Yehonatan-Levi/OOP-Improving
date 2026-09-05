package ride;

import vehicle.*;
import vehicle.Factory.VehicleTypes;
import vehicle.Factory.VehiclesList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class RideManager {

    private final Consumer<ArrayList<IVehicle>> priorityAnyVehicleRequest = (arrayList) -> {
        arrayList.sort(Comparator.comparingInt(IVehicle::getPassengerLimit));
    };
    private final VehiclesList vehiclesList;

    public RideManager(){
        vehiclesList = new VehiclesList();
    }

    public VehiclesList getVehiclesList(){
        return vehiclesList;
    }

    public Ride getRide(RideRequest rideRequest, String driver){
        ArrayList<IVehicle> availableVehicles = this.getAvailableVehicles();
        Ride ride = new Ride (driver,
                getAvailableVehicle(rideRequest.getRequestedVehicle(), availableVehicles),
                rideRequest.getPassengerCount());
        System.out.println(assignRideText(rideRequest, ride, availableVehicles));
        return ride;
    }

    private ArrayList<IVehicle> getAvailableVehicles() {
        ArrayList<IVehicle> availableVehicles = new ArrayList<>(this.vehiclesList.getVehicles());
        availableVehicles.removeIf(vehicle -> !vehicle.getIsAvailable());
        return availableVehicles;
    }

    private IVehicle getAvailableVehicle(VehicleTypes vehicleType, ArrayList<IVehicle> vehicles) throws RuntimeException {
        switch (vehicleType){
            case Any -> {
                priorityAnyVehicleRequest.accept(vehicles);
                return vehicles.getFirst();
            }
            case Car -> {
                for (IVehicle vehicle: vehicles){
                    if (vehicle instanceof Car){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Car available");
            }
            case Van -> {
                for (IVehicle vehicle: vehicles){
                    if (vehicle instanceof Van){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Van available");
            }
            case Motorcycle -> {
                for (IVehicle vehicle: vehicles){
                    if (vehicle instanceof Motorcycle){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Motorcycle available");
            }
        }
        throw new RuntimeException("no vehicles available");
    }

    private String assignRideText(RideRequest rideRequest, Ride ride, ArrayList<IVehicle> availableVehicles){
        return rideRequest + "\n\n" +
                "Available Vehicles:\n" +
                VehiclesUtils.vehicleListSummary(availableVehicles) +"\n\n" +
                "Result:\n" +
                ride.getVehicle().toString() + " assigned";
    }
}
