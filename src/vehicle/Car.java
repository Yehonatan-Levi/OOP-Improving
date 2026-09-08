package vehicle;

public class Car extends Vehicle{

    public Car(int id, String licensePlate, int passengerLimit, int pricePerKm) {
        super(id, licensePlate, passengerLimit, pricePerKm);
    }

    @Override
    public String start() {
        return "Car is starting";
    }

}
