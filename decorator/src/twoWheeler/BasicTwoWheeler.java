package twoWheeler;

public class BasicTwoWheeler implements TwoWheeler {

    public BasicTwoWheeler() {
        System.out.println("BasicHondaTwoWheeler is called");
    }

    @Override
    public double getBasePrice() {
        return 100000.00;
    }
}
