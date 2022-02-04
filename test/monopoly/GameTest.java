package monopoly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void gameTest(){
        Game game = new Game();
        //game.initialize();
        assertEquals(3, game.board.players.size());
        assertEquals("Max", game.board.players.get(0).name);
    }
}