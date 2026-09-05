package vehicle;

import java.util.ArrayList;

public class VehiclesUtils {
    public static String vehicleListSummary(ArrayList<IVehicle> vehicles){
        StringBuilder summary = new StringBuilder();
        for (IVehicle vehicle : vehicles){
            summary.append(vehicle.toString()).append(" - capacity ").append(vehicle.getPassengerLimit()).append("\n");
        }
        return summary.toString();
    }
}
