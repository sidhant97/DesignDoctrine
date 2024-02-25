package accessories;

import twoWheeler.TwoWheeler;

public class SeatCover implements AddAccessories {

    private final TwoWheeler twoWheeler;

    public SeatCover(TwoWheeler twoWheeler) {
        this.twoWheeler = twoWheeler;
        getDescription();
    }

    @Override
    public void getDescription() {
        System.out.println("SeatCover added");
    }

    @Override
    public double getBasePrice() {
        return this.twoWheeler.getBasePrice() + 500;
    }
}
