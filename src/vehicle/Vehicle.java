package vehicle;

public abstract class Vehicle implements IVehicle{
    private final int ID;
    private final String LICENSE_PLATE;
    private final int PASSENGER_LIMIT;
    private boolean isAvailable;

    public Vehicle(int id, String licensePlate, int passengerLimit){
        this.ID = id;
        this.LICENSE_PLATE = licensePlate;
        this.PASSENGER_LIMIT = passengerLimit;
        this.isAvailable = true;
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

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return this.getClass().getName().substring(8) + " "+ getLicensePlate();
    }
}
