package factoryMethod;

public class MySQLDataBaseFactory extends DataBaseFactory {
    @Override
    protected DataBase createConnection() {
        return new MySQLDataBase();
    }
}
