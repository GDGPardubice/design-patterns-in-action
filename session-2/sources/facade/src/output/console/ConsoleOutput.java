package output.console;

import output.IOutput;

public class ConsoleOutput implements IOutput {

    private ConsoleHelper consoleHelper = new ConsoleHelper();

    @Override
    public void display(Object text) {
        consoleHelper.drawText("Result is: " + String.valueOf(text));
        consoleHelper.drawEmptyLine();
        consoleHelper.drawLine();
    }
}
