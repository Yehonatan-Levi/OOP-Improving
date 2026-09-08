package vehicle;

public interface IVehicle {
    public String start();
    public int getPassengerLimit();
    public boolean getIsAvailable();
    public void setTaken();
    public void setAvailable();
    public double getPricePerKm();

}
