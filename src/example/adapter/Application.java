package example.adapter;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Target obj1 = new ConcreteTarget();
        obj1.doOldWay();
        
        Target obj2 = new Adapter(new Adaptee());
        obj2.doOldWay();
    }

}
