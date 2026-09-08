package ride;

import client.IClient;
import vehicle.Factory.VehicleTypes;

public interface IRideRequest {
    public int passengerCount();
    public VehicleTypes requestedVehicle();
    public double km();
    public IClient client();
}
