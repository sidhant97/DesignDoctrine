package withBuilderV0;


public class Person {
    private final String name;
    private final int age;
    private final String phoneNumber;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.age = personBuilder.getAge();
        this.phoneNumber = personBuilder.getPhoneNumber();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
