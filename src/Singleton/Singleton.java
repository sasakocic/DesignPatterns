package Singleton;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance()
    {
        if (instance == null) {
            Singleton aSingleton = new Singleton();
            instance = aSingleton;
        }

        return instance;
    }
}
