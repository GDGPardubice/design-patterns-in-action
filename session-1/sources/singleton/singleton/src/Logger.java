
public class Logger {

    private static Logger logger;
    private static Object lock = new Object();

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (lock) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
