package learningreview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSquares100Test {
    @Test
    public void testSumOfSquares(){
        assertEquals(338350, SumOfSquares100.getSumOfSquares100(100));
    }

}