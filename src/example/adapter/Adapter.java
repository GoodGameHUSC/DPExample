package example.adapter;

public class Adapter implements Target {

    private Adaptee instance = null;
    public Adapter(Adaptee instance) {
        // TODO Auto-generated constructor stub
        this.instance = instance;
    }
    
    @Override
    public void doOldWay() {
        // TODO Auto-generated method stub
        this.instance.doNewWay();

    }

}
