
import engines.BigEngine;
import engines.SmallEngine;
import vehicles.BigBus;
import vehicles.SmallCar;
import vehicles.Vehicle;

public class Demo {

    public static void main(String[] args) {
        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

        vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();
    }
}
