package aufgabe2_010422;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    public String name;
    public List<Airport> connections;


    public Airport(String name){
        this.name=name;
        this.connections=new ArrayList<>();
    }
}
