package vehicle.Factory;

import vehicle.Van;
import vehicle.Vehicle;

public class VanFactory {
    final static int VAN_PASSENGER_LIMIT = 8;

    static Vehicle createVan(int id, String licencePlate){
        return new Van(id, licencePlate, VAN_PASSENGER_LIMIT);
    }
}
