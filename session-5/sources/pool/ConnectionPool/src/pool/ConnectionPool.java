package pool;



import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ConnectionPool {

    private List<Connection> locked, unlocked;
    private int poolSize;

    public ConnectionPool(int size) {
        poolSize = size;
        locked = new LinkedList<>();
        unlocked = new LinkedList<>();
    }

    public Connection aquireConnection() throws NoAvailableConnectionException {
        Connection connection;
        if (unlocked.size() > 0) {
            connection = unlocked.remove(0);
            locked.add(connection);
            return connection;
        }

        if (locked.size() < poolSize) {
            connection = createConnection();
            locked.add(connection);
            return connection;
        }

        throw new NoAvailableConnectionException();
    }

    public void releaseConnection(Connection t) {
        locked.remove(t);
        unlocked.add(t);
    }

    public void printStatus() {
        System.out.println("Active connections:" + locked.size());
        System.out.println("Inactive connections:" + unlocked.size());
    }

    private Connection createConnection() {
        return new Connection(new Random().nextInt(1000));
    }

    public class NoAvailableConnectionException extends Exception {
    }
}
