import client.Client;
import client.Member;
import ride.RideOrderManager;
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
    RideOrderManager rideOrderManager = new RideOrderManager(vehicles);
    Client client = new Client();
    client.Member member = new Member();

    RideRequest rideRequest = new RideRequest(3, VehicleTypes.Any, 12, client);
    Ride ride = rideOrderManager.assignRide(rideRequest, "Alon");
    System.out.println("\n**************\n" + rideOrderManager.getTotalPrice(ride) + "**************\n");
    ride.startRide();

    RideRequest anotherRideRequest = new RideRequest(3, VehicleTypes.Any, 12, member);
    Ride anotherRide = rideOrderManager.assignRide(anotherRideRequest, "Different Alon");
    System.out.println("\n**************\n" + rideOrderManager.getTotalPrice(anotherRide) + "\n**************\n");
    anotherRide.startRide();

}
