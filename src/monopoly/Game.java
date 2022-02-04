package monopoly;

import java.util.Arrays;

public class Game {
    Board board;
    public Game(){

    }
    public void initialize(){
        Player player1=new Player("Max",200);
        Player player2=new Player("John",200);
        this.board=new Board(Arrays.asList(player1,player2));
        this.board.initialize();
    }
}
