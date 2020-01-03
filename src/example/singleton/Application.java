package example.singleton;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.createdAt);
        System.out.println(instance2.createdAt);
        System.out.println(instance == instance2);
        // OK
    }

}
