import airportssolution.Airport;
import airportssolution.Airports;

import java.util.List;


public class Application {

    public static void main(String args[]) throws Exception {
        Airports airports = new Airports();
        Airport berlin = new Airport("Berlin");
        Airport paris = new Airport("Paris");
        Airport london = new Airport("London");
        Airport shanghai = new Airport("Shanghai");
        Airport peking = new Airport("Peking");
            berlin.adjacentNodes.add(london);
            london.adjacentNodes.add(berlin);

            paris.adjacentNodes.add(london);

            london.adjacentNodes.add(paris);
            london.adjacentNodes.add(shanghai);
        airports.allNodes.add(berlin);
        airports.allNodes.add(paris);
        airports.allNodes.add(london);
        airports.allNodes.add(shanghai);
        airports.allNodes.add(peking);

        List<Airport> route = airports.calculateShortestRoute(berlin, shanghai);
        for(Airport airport : route) {
                System.out.println(airport.name);
        }
    }

}
