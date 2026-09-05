package vehicle.Factory;

import vehicle.Car;
import vehicle.Vehicle;

public class CarFactory {
    public final static int CAR_PASSENGER_LIMIT = 5;

    static Vehicle createCar(int id, String licensePlate){
        return new Car(id, licensePlate, CAR_PASSENGER_LIMIT);
    }
}
