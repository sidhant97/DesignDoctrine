package withoutBuilderV0;

public class Company {
    private String name;
    private String email;
    private String phone;
    private double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (isValidName(name)) {
            this.name = name;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
