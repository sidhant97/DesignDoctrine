package singleThreaded;


public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {
        System.out.println("Single Thread is called");
    }

    public static DatabaseConnection getInstance() {
        if (null == databaseConnection) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
}
