package vehicle.Factory;

import vehicle.Van;
import vehicle.Vehicle;

public class VanFactory {
    private final static int VAN_PASSENGER_LIMIT = 8;
    private final static int PRICE_PER_KM = 10;

    static Vehicle createVan(int id, String licencePlate){
        return new Van(id, licencePlate, VAN_PASSENGER_LIMIT, PRICE_PER_KM);
    }
}
