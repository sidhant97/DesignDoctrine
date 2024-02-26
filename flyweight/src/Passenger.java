public class Passenger {
    public static void main(String[] args) {

        AirTransport flight = AirTransportFactory.getFlight("Pk02");
        flight.setCaptionName("XYZ");
        flight.travel();


        flight = AirTransportFactory.getFlight("Pk03");
        flight.setCaptionName("ABC");
        flight.travel();

        flight = AirTransportFactory.getFlight("Pk02");
        flight.setCaptionName("QWE");
        flight.travel();


    }
}