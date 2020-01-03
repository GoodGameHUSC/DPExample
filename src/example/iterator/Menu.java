package example.iterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Item> menuItems = new ArrayList<>();

    public void addItem(Item item) {
        menuItems.add(item);
    }

    public Iteraror<Item> iterator() {
        return new MenuIterator();
    }

    class MenuIterator implements Iteraror<Item> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return currentIndex < menuItems.size();
        }

        @Override
        public Item next() {
            // TODO Auto-generated method stub
            Item item = menuItems.get(currentIndex);
            currentIndex++;
            return item;
        }

        public Item current() {
            Item item = menuItems.get(currentIndex);
            return item;
        }

    }
}
