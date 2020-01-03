package example.command;

public class ActionOpen implements ActionListener {

    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void excute() {
        // TODO Auto-generated method stub
        this.doc.open();
    }

}
