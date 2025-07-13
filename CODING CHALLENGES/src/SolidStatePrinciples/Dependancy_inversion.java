package SolidStatePrinciples;

// ❌ Violating Dependency Inversion Principle
class MySQLDatabase_V1 {
    public void save(String data) {
        System.out.println("Saving data to MySQL (V1): " + data);
    }
}

class UserService_V1 {
    private MySQLDatabase_V1 database = new MySQLDatabase_V1();

    public void registerUser(String username) {
        database.save(username); // tightly coupled
    }
}

// ✅ Following Dependency Inversion Principle
interface Database {
    void save(String data);
}

class MySQLDatabase_V2 implements Database {
    public void save(String data) {
        System.out.println("Saving data to MySQL (V2): " + data);
    }
}

class UserService_V2 {
    private Database database;

    public UserService_V2(Database database) {
        this.database = database;
    }

    public void registerUser(String username) {
        database.save(username); // uses abstraction
    }
}

// Main entry point
public class Dependecy_Inversion_Principle {
    public static void main(String[] args) {
        System.out.println("Without DIP:");
        UserService_V1 badService = new UserService_V1();
        badService.registerUser("alice");

        System.out.println("\nWith DIP:");
        Database db = new MySQLDatabase_V2();
        UserService_V2 goodService = new UserService_V2(db);
        goodService.registerUser("bob");
    }
}
