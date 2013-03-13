package output.console;

public class ConsoleHelper {

    private int width = 20;

    public void drawLine() {
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    void drawText(String text) {
        System.out.print(text);
    }

    void drawEmptyLine() {
        System.out.println();
    }
}
