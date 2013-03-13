
import calculator.Calculator;
import calculator.ICalculator;
import output.IOutput;
import output.console.ConsoleOutput;

public class Demo {

    public static void main(String[] args) {
        ICalculator calculator = new Calculator();
        IOutput output = new ConsoleOutput();
        
        double result1 = calculator.negative(-4);
        output.display(result1);

        double result2 = calculator.square(8);
        output.display(result2);

        double result3 = calculator.mean(64, 32);
        output.display(result3);
    }
}
