package withBuilderV1;

public class PersonDemo {
    public static void main(String[] args) {

        PersonBuilder personBuilder = Person.createBuilder();
        personBuilder.setName("XYZ");
        personBuilder.setAge(45);
        personBuilder.setPhoneNumber("1234567899");
        Person person = personBuilder.build();
        System.out.println(person.toString());
    }
}
