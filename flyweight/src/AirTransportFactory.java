import java.util.HashMap;
import java.util.Map;

public class AirTransportFactory {

    private final static Map<String, FlightTransport> flightFactory = new HashMap<>();


    public static AirTransport getFlight(String flightNo) {
        FlightTransport flight = flightFactory.get(flightNo);
        if (flight == null) {
            flight = new FlightTransport(flightNo, 200, 5);
            flightFactory.put(flightNo, flight);
            System.out.println("flightNo " + flightNo);
        }
        return flight;
    }

}
