package ride;

import vehicle.*;
import vehicle.Factory.VehicleTypes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class RideManager {

    private final ArrayList<IVehicle> vehicles;
    private final Consumer<ArrayList<IVehicle>> priorityAnyVehicleRequest = (arrayList) -> {
        arrayList.sort(Comparator.comparingInt(IVehicle::getPassengerLimit));
    };

    public RideManager(){
        this.vehicles = new ArrayList<>();
    }

    public RideManager(ArrayList<IVehicle> vehicles){
        this.vehicles = new ArrayList<>();
        this.vehicles.addAll(vehicles);
    }

    public void addVehicle(IVehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public Ride getRide(RideRequest rideRequest, String driver){
        return new Ride (driver,
                getAvailableVehicle(rideRequest.getRequestedVehicle()),
                rideRequest.getPassengerCount());
    }

    private IVehicle getAvailableVehicle(VehicleTypes vehicleType) throws RuntimeException {
        switch (vehicleType){
            case Any -> {
                priorityAnyVehicleRequest.accept(vehicles);
                for (IVehicle vehicle: vehicles){
                    if (vehicle.getIsAvailable()){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no vehicles available");
            }
            case Car -> {
                for (IVehicle vehicle: vehicles){
                    if (vehicle instanceof Car && vehicle.getIsAvailable()){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Car available");
            }
            case Van -> {
                for (IVehicle vehicle: vehicles){
                    if (vehicle instanceof Van && vehicle.getIsAvailable()){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Van available");
            }
            case Motorcycle -> {
                for (IVehicle vehicle: vehicles){
                    if (vehicle instanceof Motorcycle && vehicle.getIsAvailable()){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Motorcycle available");
            }
        }
        throw new RuntimeException("no vehicles available");
    }
}
