package factoryMethod;

public class Client {


    public static void main(String[] args) {
        DataBaseFactory dataBaseFactory = new DataBaseConnection();
        DataBase dataBase = dataBaseFactory.createConnection("oracle");
        System.out.println("**********************************************");
        dataBaseFactory.getDataBase("oracle");
        System.out.println(dataBase);

    }
}
