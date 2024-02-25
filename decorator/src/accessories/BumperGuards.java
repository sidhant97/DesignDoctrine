package accessories;

import twoWheeler.TwoWheeler;

public class BumperGuards implements AddAccessories {

    private final TwoWheeler twoWheeler;

    public BumperGuards(TwoWheeler twoWheeler) {
        this.twoWheeler = twoWheeler;
        getDescription();
    }

    @Override
    public void getDescription() {
        System.out.println("BumperGuards added");
    }

    @Override
    public double getBasePrice() {
        return this.twoWheeler.getBasePrice() + 1500;
    }
}
