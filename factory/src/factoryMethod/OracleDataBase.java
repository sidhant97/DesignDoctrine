package factoryMethod;

public class OracleDataBase implements DataBase {
    public OracleDataBase() {
        System.out.println("OracleDataBase called");
    }

    @Override
    public void getDriver() {
        System.out.println("getDriver");
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
