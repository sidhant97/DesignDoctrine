package withoutBuilderV1;

public class Client {
    public static void main(String[] args) {
        Company company = new Company("ABC", 123456);
        System.out.println(company);

    }
}
