package vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(int id, String licensePlate, int passengerLimit, int pricePerKm) {
        super(id, licensePlate, passengerLimit, pricePerKm);
    }

    @Override
    public String start() {
        return "Motorcycle is starting";
    }
}
