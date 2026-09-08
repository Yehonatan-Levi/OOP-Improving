package vehicle;

import vehicle.Factory.VehicleTypes;

import java.util.Comparator;

public interface IVehiclesCollection {
    public void addVehicle(IVehicle vehicle);
    public IVehicle getAvailableVehicle(VehicleTypes vehicleType, int passengersCount, Comparator<IVehicle> compareByPriority);

}
