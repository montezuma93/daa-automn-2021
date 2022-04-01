package aufgabe010422;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void customerTest(){
        Customer karlHeinz = new Customer("Karl", "Heinz", 123456, -500);
        karlHeinz.deposit(100);
        assertEquals(100, karlHeinz.getMoney());
    }

}