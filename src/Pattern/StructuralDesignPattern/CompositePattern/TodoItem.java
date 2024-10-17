package Pattern.StructuralDesignPattern.CompositePattern;

public class TodoItem implements Completable {
    private final String description;
    private boolean completed = false;

    public TodoItem(String description) {
        this.description = description;
    }

    public void complete() {
        completed = true;
    }
//    overridden method from Completable interface
    @Override
    public void isComplete() {
        System.out.println("Todo Item \"" + description + "\" is completed" + completed);

    }
}
