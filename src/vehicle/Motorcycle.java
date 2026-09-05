package vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(int id, String licensePlate, int passengerLimit) {
        super(id, licensePlate, passengerLimit);
    }

    @Override
    public boolean start() {
        System.out.println("Motorcycle is starting");
        return true;
    }
}
