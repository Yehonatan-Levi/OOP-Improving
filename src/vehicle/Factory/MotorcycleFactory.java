package vehicle.Factory;

import vehicle.Motorcycle;
import vehicle.Van;
import vehicle.Vehicle;

public class MotorcycleFactory {
    final static int MOTORCYCLE_PASSENGER_LIMIT = 1;

    static Vehicle createMotorcycle(int id, String licencePlate){
        return new Motorcycle(id, licencePlate, MOTORCYCLE_PASSENGER_LIMIT);

    }
}
