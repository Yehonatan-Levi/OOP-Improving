package vehicle;

import vehicle.Factory.VehicleTypes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class VehiclesRepository implements IVehiclesCollection{
    private final ArrayList<IVehicle> vehicles;

    public VehiclesRepository(){
        vehicles = new ArrayList<>();
    }

    public void addVehicle(IVehicle vehicle){
        vehicles.add(vehicle);
    }

    public ArrayList<IVehicle> getVehicles(){
        return vehicles;
    }

    private ArrayList<IVehicle> getAvailableVehicles(){
        return vehicles.stream()
                .filter(IVehicle::getIsAvailable)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void setPriority(Comparator<IVehicle> comparator){
        vehicles.sort(comparator);
    }

    public IVehicle getAvailableVehicle(VehicleTypes vehicleType, int passengersCount, Comparator<IVehicle> compareByPriority) throws RuntimeException {
        this.setPriority(compareByPriority);
        ArrayList<IVehicle> availableVehicles = this.getAvailableVehicles();
        switch (vehicleType){
            case Any -> {
                for (IVehicle vehicle : availableVehicles){
                    if (vehicle.getPassengerLimit() >= passengersCount){
                        return vehicle;
                    }
                }
            }
            case Car -> {
                for (IVehicle vehicle: availableVehicles){
                    if (vehicle instanceof Car){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Car available");
            }
            case Van -> {
                for (IVehicle vehicle: availableVehicles){
                    if (vehicle instanceof Van){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Van available");
            }
            case Motorcycle -> {
                for (IVehicle vehicle: availableVehicles){
                    if (vehicle instanceof Motorcycle){
                        return vehicle;
                    }
                }
                throw new RuntimeException("no Motorcycle available");
            }
        }
        throw new RuntimeException("no vehicles available");
    }

    public String toString (){
        StringBuilder summary = new StringBuilder();
        for (IVehicle vehicle : vehicles){
            summary.append(vehicle.toString()).append(" - capacity ").append(vehicle.getPassengerLimit()).append("\n");
        }
        return summary.toString();
    }

}
