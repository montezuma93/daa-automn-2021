package learningreview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
     @Test
    public void consumptionTest(){
         Vehicle vehicle = new Vehicle("White");
         assertEquals(20, vehicle.getConsumption(10,200));
         assertEquals(36, vehicle.getTravelCosts(10, 200,1.8));


     }

}