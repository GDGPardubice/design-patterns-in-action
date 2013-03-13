package calculator;

public class Calculator implements ICalculator {

    private final Adder adder = new Adder();
    private final Multiplier multiplier = new Multiplier();

    @Override
    public double negative(double a) {
        return adder.subtract(0, a);
    }

    @Override
    public double mean(double a, double b) {
        return multiplier.divide(adder.add(a, b), 2.0);
    }

    @Override
    public double square(double a) {
        return multiplier.multiply(a, a);
    }
}
