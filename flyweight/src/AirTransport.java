public interface AirTransport {
    void travel();

    String getFlightNo();

    void setFlightNo(String flightNo);

    String getCaptionName();

    void setCaptionName(String captionName);

    IntrinsicFlightTransport getIntrinsicFlightTransport();
}
