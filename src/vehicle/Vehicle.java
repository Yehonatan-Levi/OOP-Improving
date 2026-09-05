package vehicle;

public abstract class Vehicle implements IVehicle{
    private final int ID;
    private final String LICENSE_PLATE;
    private final int PASSENGER_LIMIT;

    public Vehicle(int id, String licensePlate, int passengerLimit){
        this.ID = id;
        this.LICENSE_PLATE = licensePlate;
        this.PASSENGER_LIMIT = passengerLimit;
    }

    public int getId() {
        return ID;
    }

    public String getLicensePlate() {
        return LICENSE_PLATE;
    }

    public int getPassengerLimit() {
        return PASSENGER_LIMIT;
    }
}
