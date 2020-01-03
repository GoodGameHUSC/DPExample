package example.observer;

import java.util.Date;

public class Observer implements IObserver {

    @Override
    public void update() {
        System.out.println("Updated"+ new Date());
    }

}
