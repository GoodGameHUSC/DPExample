package example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, ConcreteFlyweight> cachedData = new HashMap<String, ConcreteFlyweight>();

    public static ConcreteFlyweight create(String name, String context) {
        ConcreteFlyweight instance = cachedData.get(name);
        if (instance == null) {
            instance = new ConcreteFlyweight(name);
            cachedData.put(name, instance);
        }
        instance.doSomething(context);
        return instance;
    }
}
