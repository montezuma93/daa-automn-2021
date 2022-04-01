package airportssolution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Airports {

    public List<Airport> allNodes;

    public Airports() {
        allNodes = new ArrayList<>();
    }

    public List<Airport> calculateShortestRoute(Airport start, Airport end) throws Exception {
        List<Airport> traversedNodes = new ArrayList<>();
        HashSet<Airport> visitedNodes = new HashSet<>();
        visitedNodes.add(start);

        LinkedList<Airport> queue = new LinkedList<>();
        queue.addLast(start);
        while (queue.size() != 0) {
            Airport nextAirport = queue.getFirst();
            queue.removeFirst();
            traversedNodes.add(nextAirport);
            if (nextAirport == end) {
                return traversedNodes;
            } else {
                for (Airport airport : nextAirport.adjacentNodes) {
                    if (!visitedNodes.contains(airport)) {
                        visitedNodes.add(airport);
                        queue.addLast(airport);
                       }
                }
            }
        }
        throw new Exception("notfound");
    }



}



