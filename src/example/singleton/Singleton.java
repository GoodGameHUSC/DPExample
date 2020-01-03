package example.singleton;

import java.util.Date;

public class Singleton {

    private static Singleton instance = null;

    public Date createdAt = null;

    public Singleton() {
        this.createdAt = new Date();
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}
