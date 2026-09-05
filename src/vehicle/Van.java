package vehicle;

public class Van extends Vehicle {

    public Van(int id, String licensePlate, int passengerLimit) {
        super(id, licensePlate, passengerLimit);
    }

    @Override
    public String start() {
        return "Van is starting";
    }
}
