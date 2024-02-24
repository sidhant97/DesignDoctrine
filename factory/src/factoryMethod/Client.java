package factoryMethod;

public class Client {


    public static void main(String[] args) {
        DataBaseFactory dataBaseFactory = new OracleDataBaseFactory();
        DataBase dataBase = dataBaseFactory.createConnection();
        System.out.println("**********************************************");
        dataBaseFactory.getDataBase();
        System.out.println(dataBase);

    }
}
