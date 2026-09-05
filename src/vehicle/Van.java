package vehicle;

public class Van extends Vehicle {

    public Van(int id, String licensePlate, int passengerLimit) {
        super(id, licensePlate, passengerLimit);
    }

    @Override
    public boolean start() {
        System.out.println("Van is starting");
        return true;
    }
}
