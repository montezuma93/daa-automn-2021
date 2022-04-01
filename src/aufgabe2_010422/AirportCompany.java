package aufgabe2_010422;

import java.util.ArrayList;
import java.util.List;

public class AirportCompany {
    public String name;
    public List<Airport> airportNetworks;


    public AirportCompany(String name){
        this.name = name;
        this.airportNetworks = new ArrayList<Airport>();
    }

    public boolean exsistConnection(Airport start, Airport end){
        return false;
    }
}
