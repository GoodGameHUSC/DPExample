package example.flyweight;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConcreteFlyweight instanse1 = FlyweightFactory.create("duc", "duc oc cho");
        ConcreteFlyweight instanse2 = FlyweightFactory.create("duc", "duc oc cho lan 2");
        ConcreteFlyweight instanse3 = FlyweightFactory.create("tuan", "tuan oc cho");
        ConcreteFlyweight instanse4 = FlyweightFactory.create("tuan", "tuan oc cho lan 2");
    }

}
