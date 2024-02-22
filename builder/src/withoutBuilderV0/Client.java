package withoutBuilderV0;

public class Client {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("ABC");
        company.setEmail("abc@xyz.com");
        company.setPhone("1234567890");
        company.setSalary(1230456);
        System.out.println(company);
    }
}
