package Factory;

public class FactoryTest {
    public static void main(String[] args) {
        Connection aConnection1 = ConnectionFactory.create();
        Connection aConnection2 = Connection.create();
        System.out.println("Connection1 creted " + aConnection1.getClass());
        System.out.println("Connection2 creted " + aConnection2.getClass());
    }
}
