package example.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String name;

    public ConcreteFlyweight(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
        System.out.println("New instace is created and named :"+ name);
    }

    @Override
    public void doSomething(String context) {
        System.out.println(context);
    }

}
