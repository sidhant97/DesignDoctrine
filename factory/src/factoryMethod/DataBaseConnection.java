package factoryMethod;

public class DataBaseConnection extends DataBaseFactory {
    @Override
    protected DataBase createConnection(String dataBase) {
        if (dataBase.equals("mysql")) {
            return new MySQLDataBase();
        } else if (dataBase.equals("oracle")) {
            return new OracleDataBase();
        }
        return null;
    }
}
