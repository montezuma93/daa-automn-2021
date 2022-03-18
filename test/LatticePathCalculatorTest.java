import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LatticePathCalculatorTest {


    @Test
    public void testCalculatePathCombinations() {
        LatticePathCalculator latticePathCalculator = new LatticePathCalculator();
        assertEquals(10, latticePathCalculator.calculatePathCombinations(15,15));
    }
}