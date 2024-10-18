package Pattern.StructuralDesignPattern.DecoratorPattern;

public class AdminUser extends UserDecorator {


    public AdminUser(User user) {
        super(user);
    }

    @Override
    public void printPrivileges() {
        super.printPrivileges();
        System.out.println("Can create new user");
    }
}
