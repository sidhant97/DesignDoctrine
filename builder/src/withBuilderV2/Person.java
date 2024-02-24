package withBuilderV2;


public class Person {
    private final String name;
    private final int age;
    private final String phoneNumber;

    private Person(PersonBuilder personBuilder) {
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

    public static PersonBuilder createBuilder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private int age;
        private String phoneNumber;

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }


        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public PersonBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private boolean validate() {
            return this.phoneNumber.length() == 10;
        }

        public Person build() {
            // start validations
            if (!validate()) {
                throw new RuntimeException("Invalid Request");
            }
            // end validations

            return new Person(this);
        }
    }


}
