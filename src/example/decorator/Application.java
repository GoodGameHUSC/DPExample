package example.decorator;

public class Application {

    public static void main(String[] args) {
        Component instance = new ConcreteComponent();
        instance = new DecoratorConcreteFirst(instance);
        instance = new DecoratorConcreteSecond(instance);
        
        instance.doOperation();
        
        // OK
    }
}
