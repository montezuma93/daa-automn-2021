package airportssolution;

import java.util.ArrayList;
import java.util.List;

public class Airport {
        public String name;
        public List<Airport> adjacentNodes;

    Airport(String name, List<Airport> adjacentNodes) {
        this.name = name;
        this.adjacentNodes = adjacentNodes;
    }

    public Airport(String name) {
        this.name = name;
        this.adjacentNodes = new ArrayList<>();
    }

}
