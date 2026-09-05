package vehicle;

public interface IVehicle {
    public String start();
    public int getPassengerLimit();
    public boolean getIsAvailable();
    public void setIsAvailable(boolean isAvailable);

}
