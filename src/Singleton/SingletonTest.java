package Singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton aSingleton1 = Singleton.getInstance();
        Singleton aSingleton2 = Singleton.getInstance();
        if (aSingleton1 == aSingleton2) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are not the same");
        }
    }
}
