package AbstractClasses;

public class Abstract {
    public static void main(String[] args) {

        Admin currentAdmin = new Admin(3456, "Christine", "Christine123!");

        User currentUser = new User(8899, "John");

        currentAdmin.performOperation(new Update());

        currentUser.performOperation(new View());


    }
}
