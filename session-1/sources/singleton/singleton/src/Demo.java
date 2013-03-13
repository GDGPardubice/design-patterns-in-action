
public class Demo {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Jsou stejné");
        }

        Logger.getInstance().log("Testovací log zpráva");
    }
}
