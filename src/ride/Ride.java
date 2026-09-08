package ride;

import vehicle.IVehicle;

public class Ride {
    private final String driver;
    private final IVehicle vehicle;
    private final int passengers;
    private final double km;

    public Ride(String driver, IVehicle vehicle, int passengers, double km){
        this.driver = driver;
        this.vehicle = vehicle;
        this.passengers = passengers;
        this.km = km;
    }

    public IVehicle getVehicle() {
        return vehicle;
    }

    public void startRide(){
        if (isValidRide()){
            System.out.println(this.toString() + "\n");
            System.out.println("starting ride...");
            System.out.println(vehicle.start());
            System.out.println("ride started");
        }
        else {
            System.out.println("Invalid ride: too many passengers");
        }
    }

    public double getPrice(){
        return this.km * this.vehicle.getPricePerKm();
    }

    private boolean isValidRide(){
        return passengers <= vehicle.getPassengerLimit();
    }

    public String toString(){
        return "Driver: " + driver  + "\nVehicle: " + vehicle + "\nPassengers: " + passengers + "\nPrice: " + this.getPrice();
    }
}
