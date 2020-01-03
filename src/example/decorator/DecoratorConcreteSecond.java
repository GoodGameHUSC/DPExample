package example.decorator;

public class DecoratorConcreteSecond extends Decorator {

    public DecoratorConcreteSecond(Component wrappee) {
        super(wrappee);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void doOperation() {
        this.getWrappee().doOperation();
        // TODO Auto-generated method stub
        System.out.println("doOperation from DecoratorConcreteSecond");
    }

    @Override
    public void doMoreOperating() {
        // TODO Auto-generated method stub
        System.out.println("doMoreOperating from DecoratorConcreteSecond");
    }

}
