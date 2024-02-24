package factoryMethod;

public class MySQLDataBase implements DataBase {

    public MySQLDataBase() {
        System.out.println("MySQLDataBase called");
    }

    @Override
    public void getDriver() {
        System.out.println("getDriver.");
    }

    @Override
    public void getURL() {
        System.out.println("getURL");
    }

    @Override
    public void getHost() {
        System.out.println("Data fetching.");
    }
}
