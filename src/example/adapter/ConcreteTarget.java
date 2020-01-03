package example.adapter;

public class ConcreteTarget implements Target {

    @Override
    public void doOldWay() {
        System.out.println("Do something with OLD way");
    }

}
