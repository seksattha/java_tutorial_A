package Pattern.StructuralDesignPattern.DecoratorPattern;

public class BasicUser implements User {
    @Override
    public void printPrivileges() {
        System.out.println("Can log in");

    }
}
