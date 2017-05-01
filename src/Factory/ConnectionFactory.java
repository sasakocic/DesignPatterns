package Factory;

public class ConnectionFactory {
    public static Connection create() {
        Connection aConnection = new Connection();

        return aConnection;
    }
}
