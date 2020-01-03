package example.command;

public class MenuOption {

    ActionListener openCommand;
    ActionListener saveCommand;

    public MenuOption(ActionListener openCommand, ActionListener saveCommand) {
        super();
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void clickOpen() {
        this.openCommand.excute();
    }

    public void clickSave() {
        this.saveCommand.excute();
    }
}
