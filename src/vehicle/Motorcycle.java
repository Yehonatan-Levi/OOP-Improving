package vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(int id, String licensePlate, int passengerLimit) {
        super(id, licensePlate, passengerLimit);
    }

    @Override
    public String start() {
        return "Motorcycle is starting";
    }
}
