package example.command;

public class ActionSave implements ActionListener {

    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void excute() {
        // TODO Auto-generated method stub
        this.doc.save();
    }

}
