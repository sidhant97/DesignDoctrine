public class IntrinsicFlightTransport {
    private static IntrinsicFlightTransport intrinsicFlightTransport = null;
    private final int passengerCount; //intrinsic attribute
    private final int noOfStops; //intrinsic attribute

    private IntrinsicFlightTransport(int passengerCount, int noOfStops) {
        this.noOfStops = noOfStops;
        this.passengerCount = passengerCount;

    }

    public static IntrinsicFlightTransport getInstance(int passengerCount, int noOfStops) {
        if (null == intrinsicFlightTransport) {
            synchronized (IntrinsicFlightTransport.class) {
                if (null == intrinsicFlightTransport) {
                    intrinsicFlightTransport = new IntrinsicFlightTransport(passengerCount, noOfStops);
                }
            }
        }
        return intrinsicFlightTransport;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getNoOfStops() {
        return noOfStops;
    }
}
