package vehicle;

public abstract class Vehicle implements IVehicle{
    protected final int ID;
    protected final String LICENSE_PLATE;
    protected final int PASSENGER_LIMIT;
    protected double pricePerKm;
    protected boolean isAvailable;

    public Vehicle(int id, String licensePlate, int passengerLimit, double pricePerKm){
        this.ID = id;
        this.LICENSE_PLATE = licensePlate;
        this.PASSENGER_LIMIT = passengerLimit;
        this.pricePerKm = pricePerKm;
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

    public double getPricePerKm(){
        return pricePerKm;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return this.getClass().getName().substring(8) + " "+ getLicensePlate();
    }
}
