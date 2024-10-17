package Pattern.StructuralDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Checklist implements Completable {
    List<TodoItem> todoItems = new ArrayList<>();

    public void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    @Override
    public void isComplete() {
        todoItems.forEach(TodoItem::isComplete);
    }
}
