package eagerLoading;


public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseConnection() {
        System.out.println("Eager loading is called");
    }

    public static DatabaseConnection getInstance() {
        return databaseConnection;
    }
}
