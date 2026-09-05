package vehicle.Factory;

import vehicle.Vehicle;

public class VehicleFactory {
    public Vehicle createVehicle(VehicleTypes type, int id, String licensePlate){
        return switch (type){
            case Car -> CarFactory.createCar(id, licensePlate);
            case Van -> VanFactory.createVan(id, licensePlate);
            case Motorcycle -> MotorcycleFactory.createMotorcycle(id, licensePlate);
        };
    }
}
