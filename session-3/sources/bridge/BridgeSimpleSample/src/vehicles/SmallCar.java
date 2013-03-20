package vehicles;

import engines.Engine;

public class SmallCar extends Vehicle {

    public SmallCar(Engine engine) {
        super(engine);
    }

    @Override
    protected int getWeight() {
        return 600;
    }

    @Override
    public void drive() {
        System.out.println("\nSmall car is driving.");
        engine.go();
        reportOnSpeed();
    }
}
