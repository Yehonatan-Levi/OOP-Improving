package vehicle;

public class Car extends Vehicle{

    public Car(int id, String licensePlate, int passengerLimit) {
        super(id, licensePlate, passengerLimit);
    }

    @Override
    public String start() {
        return "Car is starting";
    }

}
