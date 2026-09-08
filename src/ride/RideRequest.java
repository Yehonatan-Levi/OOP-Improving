package ride;

import client.IClient;
import vehicle.Factory.VehicleTypes;

public record RideRequest(int passengerCount, VehicleTypes requestedVehicle, double km, IClient client) implements IRideRequest {

    @Override
    public String toString() {
        return "Request:\n" +
                "Passengers: " + passengerCount + "\n" +
                "Vehicle type: " + requestedVehicle.name();
    }
}
