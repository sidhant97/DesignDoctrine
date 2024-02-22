package withBuilderV2;

public class PersonDemo {
    public static void main(String[] args) {

        Person person = Person.createBuilder()
                .setName("ABC")
                .setAge(25)
                .setPhoneNumber("1245555639773")
                .build();
        System.out.println(person.toString());
    }
}
