package simpleFactory;

public class MicrosoftCloudProvider extends CloudProvider {

    public MicrosoftCloudProvider() {
        super();
        System.out.println("simpleFactory.MicrosoftCloudProvider is called.");
    }

    @Override
    public void displayCloudProvider() {
        System.out.println("Email : " + this.getEmail());
        System.out.println("Password : " + this.getPassword());
        System.out.println("UserName : " + this.getUserName());
    }
}
