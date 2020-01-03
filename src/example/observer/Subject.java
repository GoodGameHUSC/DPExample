package example.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    List<IObserver> listObserver = new ArrayList<IObserver>();

    @Override
    public void attach(IObserver observer) {
        if (!listObserver.contains(observer))
            listObserver.add(observer);
    }
    
    @Override
    public void detach(IObserver observer) {
        if (listObserver.contains(observer))
            listObserver.remove(observer);
    }

    @Override
    public void notify_data() {
       listObserver.forEach((IObserver observer) -> observer.update());
    }

}
