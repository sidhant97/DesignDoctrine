package factoryMethod;

public abstract class DataBaseFactory {

    public DataBase getDataBase() {
        DataBase dataBaseConnection = createConnection();
        dataBaseConnection.getURL();
        dataBaseConnection.getHost();
        dataBaseConnection.getDriver();
        return dataBaseConnection;

    }

    protected abstract DataBase createConnection();
}
