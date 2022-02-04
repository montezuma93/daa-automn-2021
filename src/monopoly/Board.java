package monopoly;

import java.util.Collections;
import java.util.List;

public class Board {
    List<Player> players;
    Field[] fields;
    public Board(List<Player> players){
        this.players=players;


    }
    public void initialize(){
        this.fields=new Field[5];
        Street street1 = new Street("braun", "badStrasse", 60);
        Street street2 = new Street("braun", "turmStrasse", 70);
        Street street3 = new Street("blau", "schausseeStrasse", 80);
        Street street4 = new Street("blau", "elisemStrasse", 100);
        Street street5 = new Street("blau", "postStrasse", 60);
        TrainStation trainSt1  = new TrainStation("suedBahnhof", 200);

        this.fields[0] = street1;
        this.fields[1] = trainSt1;
        this.players.get(0).buy(street1);

    }
}
