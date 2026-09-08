import ride.RideManager;
import ride.RideRequest;
import vehicle.Factory.VehicleFactory;
import vehicle.Factory.VehicleTypes;
import vehicle.VehiclesRepository;
import ride.Ride;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    VehiclesRepository vehicles = new VehiclesRepository();
    for (int i = 0; i < 7; i += 3){
        vehicles.addVehicle(VehicleFactory.createVehicle(VehicleTypes.Van, i , "ABC-1234" + i));
        vehicles.addVehicle(VehicleFactory.createVehicle(VehicleTypes.Car, i + 1 , "ABC-1234" + (i + 1)));
        vehicles.addVehicle(VehicleFactory.createVehicle(VehicleTypes.Motorcycle, i + 2 , "ABC-1234" + (i + 2)));
    }
    RideManager rideManager = new RideManager(vehicles);
    RideRequest rideRequest = new RideRequest(3, VehicleTypes.Any, 12);
    Ride ride = rideManager.assignRide(rideRequest, "Alon");
    ride.startRide();
}
