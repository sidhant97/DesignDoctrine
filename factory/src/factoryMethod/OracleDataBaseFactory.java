package factoryMethod;

public class OracleDataBaseFactory extends DataBaseFactory {
    @Override
    protected DataBase createConnection() {
        return new OracleDataBase();
    }
}
