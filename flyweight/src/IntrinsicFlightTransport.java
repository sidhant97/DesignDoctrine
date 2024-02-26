public class IntrinsicFlightTransport {
    private static IntrinsicFlightTransport intrinsicFlightTransport = null;
    private final int passengeCount; //intrinsic attribute
    private final int noOfStops; //intrinsic attribute

    private IntrinsicFlightTransport(int passengeCount, int noOfStops) {
        this.noOfStops = noOfStops;
        this.passengeCount = passengeCount;

    }

    public static IntrinsicFlightTransport getInstance(int passengeCount, int noOfStops) {
        if (null == intrinsicFlightTransport) {
            synchronized (IntrinsicFlightTransport.class) {
                if (null == intrinsicFlightTransport) {
                    intrinsicFlightTransport = new IntrinsicFlightTransport(passengeCount, noOfStops);
                }
            }
        }
        return intrinsicFlightTransport;
    }

    public int getPassengeCount() {
        return passengeCount;
    }

    public int getNoOfStops() {
        return noOfStops;
    }
}
