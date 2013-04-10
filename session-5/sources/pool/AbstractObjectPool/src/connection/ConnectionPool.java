package connection;

import java.util.Random;
import pool.NoAvailableInstanceException;
import pool.ObjectPool;

public class ConnectionPool extends ObjectPool<Connection> {

    public ConnectionPool(int size) {
        super(size);
    }

    public Connection aquireConnection() throws NoAvailableInstanceException {
        return aquireReusable();
    }

    public void releaseConnection(Connection t) {
        releaseReusable(t);
    }

    @Override
    protected Connection createInstance() {
        return new Connection(new Random().nextInt(1000));
    }
}
