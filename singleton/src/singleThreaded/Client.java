package singleThreaded;

public class Client {
    public static void main(String[] args) {

        DatabaseConnection  databaseConnection = DatabaseConnection.getInstance();
        System.out.println( "Database Connection 1 -> " + databaseConnection);

        databaseConnection = DatabaseConnection.getInstance();
        System.out.println( "Database Connection 2 -> " + databaseConnection);

    }
}