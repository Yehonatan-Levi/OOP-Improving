package ride;

import vehicle.Factory.VehicleTypes;

public record RideRequest(int passengerCount, VehicleTypes requestedVehicle, double km) implements IRideRequest {

    @Override
    public String toString() {
        return "Request:\n" +
                "Passengers: " + passengerCount + "\n" +
                "Vehicle type: " + requestedVehicle.name();
    }
}
