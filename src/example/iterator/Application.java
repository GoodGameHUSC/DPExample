package example.iterator;

public class Application {
    public static void main(String[] args) {
     
        Menu menu = new Menu();
        menu.addItem(new Item("haha"));
        menu.addItem(new Item("huhu"));
        menu.addItem(new Item("hehe"));
        
        Iteraror<Item> iterator = menu.iterator();
        
        while(iterator.hasNext()) {            
            Item item = iterator.next();
            System.out.println(item.toString());
        }
    }
}
