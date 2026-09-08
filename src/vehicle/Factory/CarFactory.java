package vehicle.Factory;

import vehicle.Car;
import vehicle.Vehicle;

public class CarFactory {
    public final static int CAR_PASSENGER_LIMIT = 5;
    private final static int PRICE_PER_KM = 6;


    static Vehicle createCar(int id, String licensePlate){
        return new Car(id, licensePlate, CAR_PASSENGER_LIMIT, PRICE_PER_KM);
    }
}
