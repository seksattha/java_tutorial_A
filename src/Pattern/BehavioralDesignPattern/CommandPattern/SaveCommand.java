package Pattern.BehavioralDesignPattern.CommandPattern;

public class SaveCommand implements Command {
    private Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {

        document.save();

    }
}
