package withBuilderV0;

public class PersonBuilder {
    private String name;
    private int age;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        if (!validate()) {
            throw new RuntimeException("Invalid Request");
        }
        return phoneNumber;
    }


    private boolean validate() {
        return this.phoneNumber.length() == 10;
    }


}
