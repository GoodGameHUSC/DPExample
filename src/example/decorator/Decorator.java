package example.decorator;

public abstract class Decorator implements Component {
    private Component wrappee;

    public Decorator(Component wrappee) {
        // TODO Auto-generated constructor stub
        this.wrappee = wrappee;
    }

    public Component getWrappee() {
        return wrappee;
    }

    public abstract void doMoreOperating();
}
