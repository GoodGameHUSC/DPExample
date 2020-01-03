package example.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void doOperation() {
        System.out.println("doOperation from ConcreteComponent");
    }

}
