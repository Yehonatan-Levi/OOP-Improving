package ride;

import vehicle.Factory.VehicleTypes;

public interface IRideRequest {
    public int getPassengerCount();
    public VehicleTypes getRequestedVehicle();
}
