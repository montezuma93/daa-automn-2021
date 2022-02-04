package monopoly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    Board board;
    public Game(){

    }
    public void initialize(List<String> playerNames){
        int startCurrency = 200;
        List<Player>players=new ArrayList<>();
        for(String playerName:playerNames){
            players.add(new Player(playerName, startCurrency));
        }
        this.board=new Board(players);
        this.board.initialize();
        shufflePlayer();
    }
    public void start(){

    }
    public void shufflePlayer(){
        Collections.shuffle(board.players);
    }
}
