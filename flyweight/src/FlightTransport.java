public class FlightTransport implements AirTransport {

    private String flightNo; //extrinsic attribute
    private String captionName; //extrinsic attribute

    private IntrinsicFlightTransport intrinsicFlightTransport;


    public FlightTransport() {

    }

    public FlightTransport(String flightNo, int passengeCount, int noOfStops) {
        this.flightNo = flightNo;
        this.intrinsicFlightTransport = IntrinsicFlightTransport.getInstance(passengeCount, noOfStops);
    }

    @Override
    public String getFlightNo() {
        return flightNo;
    }

    @Override
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getCaptionName() {
        return captionName;
    }

    @Override
    public void setCaptionName(String captionName) {
        this.captionName = captionName;
    }

    @Override
    public IntrinsicFlightTransport getIntrinsicFlightTransport() {
        return intrinsicFlightTransport;
    }

    @Override
    public void travel() {
        System.out.println("Flight Caption name " + this.captionName +
                " is start the Flight No " + this.flightNo + " to travel.");
    }
}
