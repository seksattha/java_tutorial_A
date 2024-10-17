package Pattern.StructuralDesignPattern.CompositePattern;

public class App {

    public static void main(String[] args) {
        Checklist checklist = new Checklist();
        TodoItem todoItem1 = new TodoItem("Do this");
        TodoItem todoItem2 = new TodoItem("Do that");
        TodoItem todoItem3 = new TodoItem("Do Do something else");

        checklist.addTodoItem(todoItem1);
        checklist.addTodoItem(todoItem2);
        checklist.addTodoItem(todoItem3);

        todoItem1.complete();
    }
}
