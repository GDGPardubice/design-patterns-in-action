package vehicles;

import engines.Engine;

public class BigBus extends Vehicle {

    public BigBus(Engine engine) {
        super(engine);
    }

    @Override
    protected int getWeight() {
        return 3000;
    }

    @Override
    public void drive() {
        System.out.println("\nBig bus is driving.");
        engine.go();
        reportOnSpeed();
    }
}
