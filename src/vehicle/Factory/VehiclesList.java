package vehicle.Factory;

import vehicle.IVehicle;

import java.util.ArrayList;

public class VehiclesList {
    private final ArrayList<IVehicle> vehicles = new ArrayList<>();

    public void addVehicle(IVehicle vehicle){
        vehicles.add(vehicle);
    }

    public ArrayList<IVehicle> getVehicles(){
        return vehicles;
    }


}
