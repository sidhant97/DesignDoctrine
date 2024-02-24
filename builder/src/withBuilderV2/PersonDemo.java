package withBuilderV2;

public class PersonDemo {
    public static void main(String[] args) {

        Person person = Person.createBuilder()
                .withName("ABC")
                .withAge(25)
                .withPhoneNumber("1245555639773")
                .build();
        System.out.println(person.toString());
    }
}
