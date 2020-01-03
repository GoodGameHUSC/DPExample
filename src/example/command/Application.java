package example.command;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Document doc = new Document();
        MenuOption menu = new MenuOption(new ActionOpen(doc), new ActionSave(doc));
        menu.clickOpen();
        menu.clickSave();
    }

}
