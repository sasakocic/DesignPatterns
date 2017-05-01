package Factory;

public class FactoryTest {
    public static void main(String[] args) {
        Connection aConnection1 = ConnectionFactory.create();
        Connection aConnection2 = Connection.create();
        System.out.println("Connection1 created " + aConnection1.getClass());
        System.out.println("Connection2 created " + aConnection2.getClass());
    }
}
