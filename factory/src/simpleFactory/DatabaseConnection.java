package doubleCheckLocking;


public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {
        System.out.println("Double Check Locking is called");
    }

    public static DatabaseConnection getInstance() {
        if (null == databaseConnection) {
            synchronized (DatabaseConnection.class) {
                if (null == databaseConnection) {
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }
}
