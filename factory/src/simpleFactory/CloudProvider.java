package simpleFactory;

public abstract class CloudProvider {

    private String userName = "test";
    private String password = "Password@123";
    private String email = "test@cloud.com";

    public CloudProvider() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void displayCloudProvider();
}
