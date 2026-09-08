package vehicle;

public class Van extends Vehicle {

    public Van(int id, String licensePlate, int passengerLimit, int pricePerKm) {
        super(id, licensePlate, passengerLimit, pricePerKm);
    }

    @Override
    public String start() {
        return "Van is starting";
    }
}
