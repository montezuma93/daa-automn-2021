package monopoly;

import java.util.List;

public class Board {
    List<Player> players;
    Field[] fields;
    public Board(List<Player> players){
        this.players=players;

    }
    public void initialize(){
        this.fields=new Field[5];
    }
}
