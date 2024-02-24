package factorymethod.components.button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android Button clicked");
    }
}
