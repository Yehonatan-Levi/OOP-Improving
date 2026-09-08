package ride;

import vehicle.Factory.VehicleTypes;

public interface IRideRequest {
    public int passengerCount();
    public VehicleTypes requestedVehicle();
    public double km();
}
