package Factory;

public class Connection {
    public static Connection create() {
        Connection aConnection = new Connection();

        return aConnection;
    }
}
