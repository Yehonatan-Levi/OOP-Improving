import ride.RideManager;
import ride.RideRequest;
import vehicle.Factory.VehicleFactory;
import vehicle.Factory.VehicleTypes;
import vehicle.Vehicle;
import ride.Ride;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    RideManager rideManager = new RideManager();
    for (int i = 0; i < 7; i += 3){
        rideManager.getVehiclesList().addVehicle(VehicleFactory.createVehicle(VehicleTypes.Van, i , "ABC-1234" + i));
        rideManager.getVehiclesList().addVehicle(VehicleFactory.createVehicle(VehicleTypes.Car, i + 1 , "ABC-1234" + (i + 1)));
        rideManager.getVehiclesList().addVehicle(VehicleFactory.createVehicle(VehicleTypes.Van, i + 2 , "ABC-1234" + (i + 2)));
    }
    RideRequest rideRequest = new RideRequest(6, VehicleTypes.Any);
    Ride ride = rideManager.getRide(rideRequest, "Alon");
    ride.startRide();
}
