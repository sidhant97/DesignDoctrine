package simpleFactory;

public class GoogleCloudProvider extends CloudProvider {
    private String otp = "XXXXXX";

    public GoogleCloudProvider() {
        super();
        System.out.println("simpleFactory.MicrosoftCloudProvider is called.");
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }


    @Override
    public void displayCloudProvider() {
        System.out.println("Email : " + this.getEmail());
        System.out.println("Password : " + this.getPassword());
        System.out.println("UserName : " + this.getUserName());
        System.out.println("OTP : " + this.getOtp());
    }
}
