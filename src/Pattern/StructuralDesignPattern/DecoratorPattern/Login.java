package Pattern.StructuralDesignPattern.DecoratorPattern;

public class Login {
    public static void main(String[] args) {
        User user = new BasicUser();
        user.printPrivileges();
        User adminUser = new AdminUser(user);
        adminUser.printPrivileges();

    }
}
