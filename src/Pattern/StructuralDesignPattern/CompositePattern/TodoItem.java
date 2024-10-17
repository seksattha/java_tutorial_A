package Pattern.StructuralDesignPattern.CompositePattern;

public class TodoItem {
    private final String description;
    private boolean complete = false;

    public TodoItem(String description) {
        this.description = description;
    }

    public void complete() {
        complete = true;
    }
}
