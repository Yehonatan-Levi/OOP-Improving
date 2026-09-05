package ride;

import vehicle.Factory.VehicleTypes;

public class RideRequest implements  IRideRequest{
    private final int passengerCount;
    private final VehicleTypes requestedVehicle;

    public RideRequest(int passengerCount, VehicleTypes requestedVehicle){
        this.passengerCount = passengerCount;
        this.requestedVehicle = requestedVehicle;
    }


    @Override
    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public VehicleTypes getRequestedVehicle() {
        return requestedVehicle;
    }
}
