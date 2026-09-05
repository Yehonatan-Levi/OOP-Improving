package ride;

import vehicle.IVehicle;

public class Ride {
    private final String driver;
    private final IVehicle vehicle;
    private final int passengers;

    public Ride(String driver, IVehicle vehicle, int passengers){
        this.driver = driver;
        this.vehicle = vehicle;
        this.passengers = passengers;
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

    private boolean isValidRide(){
        return passengers <= vehicle.getPassengerLimit();
    }

    public String toString(){
        return "Driver: " + driver  + "\nVehicle: " + vehicle + "\nPassengers: " + passengers;
    }
}
