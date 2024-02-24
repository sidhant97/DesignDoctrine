package simpleFactory;

public class AWSCloudProvider extends CloudProvider {

    private String mfa = "123456";

    public AWSCloudProvider() {
        super();
        System.out.println("simpleFactory.AWSCloudProvider is called.");
    }

    public String getMfa() {
        return mfa;
    }

    public void setMfa(String mfa) {
        this.mfa = mfa;
    }

    @Override
    public void displayCloudProvider() {
        System.out.println("Email : " + this.getEmail());
        System.out.println("Password : " + this.getPassword());
        System.out.println("UserName : " + this.getUserName());
        System.out.println("MFA : " + this.getMfa());
    }
}
