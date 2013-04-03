package pool;

import connection.Connection;
import connection.ConnectionPool;

public class Demo {

    public static void main(String[] args) {
        try {
            ConnectionPool connectionPool = new ConnectionPool(3);
            connectionPool.printStatus();

            Connection connection1, connection2, connection3, connection4;

            connection1 = connectionPool.aquireConnection();
            System.out.println(connection1.getConnectionId());
            connectionPool.printStatus();

            connection2 = connectionPool.aquireConnection();
            System.out.println(connection2.getConnectionId());
            connectionPool.printStatus();

            connection3 = connectionPool.aquireConnection();
            System.out.println(connection3.getConnectionId());
            connectionPool.printStatus();

            connectionPool.releaseConnection(connection1);

            connection4 = connectionPool.aquireConnection();
            System.out.println(connection4.getConnectionId());
            connectionPool.printStatus();



        } catch (NoAvailableInstanceException ex) {
            System.out.println();
            System.out.println("!!! Nelze získat další připojení !!!");
        }
    }
}
