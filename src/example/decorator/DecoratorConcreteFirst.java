package example.decorator;

public class DecoratorConcreteFirst extends Decorator {

    public DecoratorConcreteFirst(Component wrappee) {
        super(wrappee);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void doOperation() {
        this.getWrappee().doOperation();
        // TODO Auto-generated method stub
        System.out.println("doOperation from DecoratorConcreteFirst");
    }

    @Override
    public void doMoreOperating() {
        // TODO Auto-generated method stub
        System.out.println("doMoreOperating from DecoratorConcreteFirst");
    }

}
