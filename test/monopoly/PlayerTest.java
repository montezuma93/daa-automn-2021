package monopoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void testBuy(){
        Assertions.assertEquals(5,5);
        Player player1=new Player("Max",200);
        Player player2=new Player("Heiz",200);
        Street street1=new Street("Braun","Badstrasse",60);
        Street street2=new Street("Blau","Chauseestrasse",70);
        Street street4 = new Street("blau", "elisemStrasse", 100);
        assertNull(street1.player);
        assertEquals(200,player1.currency);
        player1.buy(street1);
        Assertions.assertEquals(player1,street1.player);
        assertEquals(140,player1.currency);
        player1.buy(street2);
        assertEquals(70,player1.currency);
        player2.buy(street1);
        assertEquals(player1.name,street1.player.name);
        player1.buy(street4);
        assertEquals(70, player1.currency);
        assertFalse(street4.ownerShip);
    }
}