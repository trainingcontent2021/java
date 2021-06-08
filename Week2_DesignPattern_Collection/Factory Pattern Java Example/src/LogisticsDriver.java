import Logistics.CreateLogistics;
import Logistics.Transport.Transport;

public class LogisticsDriver {
    public static void main(String[] args) {
        CreateLogistics cl = new CreateLogistics();
        System.out.println("Handling Land Logistics");
        Transport truck = cl.createTransport("LAND");
        truck.load();
        truck.drive();
        System.out.println("Handling Sea Logistics");
        Transport ship = cl.createTransport("SEA");
        ship.load();
        ship.drive();
    }
}
