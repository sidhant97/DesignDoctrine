package accessories;

import twoWheeler.TwoWheeler;

public class FootRest implements AddAccessories {

    private final TwoWheeler twoWheeler;

    public FootRest(TwoWheeler twoWheeler) {
        this.twoWheeler = twoWheeler;
        getDescription();
    }

    @Override
    public void getDescription() {
        System.out.println("FootRest added");
    }

    @Override
    public double getBasePrice() {
        return this.twoWheeler.getBasePrice() + 700;
    }
}
