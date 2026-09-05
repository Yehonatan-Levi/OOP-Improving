import vehicle.Factory.VehicleFactory;
import vehicle.Factory.VehicleTypes;
import vehicle.Vehicle;
import ride.Ride;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Vehicle vehicle = VehicleFactory.createVehicle(VehicleTypes.Van, 1, "ABC-1234");
    Ride ride = new Ride("Aviv", vehicle, 7);
    ride.startRide();
}
