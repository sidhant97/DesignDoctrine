import accessories.BumperGuards;
import accessories.FootRest;
import accessories.SeatCover;
import twoWheeler.BasicTwoWheeler;
import twoWheeler.WithAccessoriesTwoWheeler;
import twoWheeler.TwoWheeler;

public class Customer {
    public static void main(String[] args) {

        TwoWheeler basicTwoWheeler = new BasicTwoWheeler();
        System.out.println("Show room Base Price: " + basicTwoWheeler.getBasePrice());

        basicTwoWheeler = new WithAccessoriesTwoWheeler();
        basicTwoWheeler = new BumperGuards(basicTwoWheeler);
        basicTwoWheeler = new SeatCover(basicTwoWheeler);
        basicTwoWheeler = new FootRest(basicTwoWheeler);
        System.out.println("Show room Base Price: " + basicTwoWheeler.getBasePrice());


    }
}