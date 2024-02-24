package factoryMethod;

public abstract class DataBaseFactory {

    public DataBase getDataBase(String dataBase) {
        DataBase dataBaseConnection = createConnection(dataBase);
        dataBaseConnection.getURL();
        dataBaseConnection.getHost();
        dataBaseConnection.getDriver();
        return dataBaseConnection;

    }

    protected abstract DataBase createConnection(String dataBase);
}
