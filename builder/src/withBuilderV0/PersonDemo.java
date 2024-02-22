package withBuilderV0;

public class PersonDemo {
    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setName("ABC");
        personBuilder.setAge(45);
        personBuilder.setPhoneNumber("1234567899");
        Person person = new Person(personBuilder);
        System.out.println(person);
    }
}
