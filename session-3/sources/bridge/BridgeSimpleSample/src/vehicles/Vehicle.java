package vehicles;

import engines.Engine;

public abstract class Vehicle {

    protected Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void reportOnSpeed() {
        int ratio = getWeight() / engine.getHorsePower();
        if (ratio < 3) {
            System.out.println("The vehicle is going at a fast speed.");
        } else if ((ratio >= 3) && (ratio < 8)) {
            System.out.println("The vehicle is going an average speed.");
        } else {
            System.out.println("The vehicle is going at a slow speed.");
        }
    }

    protected abstract int getWeight();
}
