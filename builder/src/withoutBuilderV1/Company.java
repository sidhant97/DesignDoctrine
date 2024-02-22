package withoutBuilderV1;

public class Company {
    private String name;
    private String email;
    private String phone;
    private double salary;

    public Company(String name, String email, String phone, double salary) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public Company(String name, double salary) {
        if (isValidName(name)) {
            this.name = name;
        }
        this.salary = salary;
    }

    public Company(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    private boolean isValidName(String name) {
        return !name.isEmpty();
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                '}';
    }
}
