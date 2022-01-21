import Car.Car;
import Car.Lkw;
import Car.Vehicle;

public class Application {

        public static void main(String args[]) throws Exception {
            Lkw myLkw = new Lkw("Red", "Skania", true, false, 380, "A-10",
                    "Öl Schneider", 2018, 2, 90, 18, 16);
            Car myCar = new Car("Surf Green", "Audi", true, false, 150,
                    "Cabrio", "Enes", 2010, 2, 250,11.2, 11);
            if (myLkw instanceof Vehicle){
                System.out.println("Lkw ist von Typ Vehicle: ");
            }
            System.out.println(myLkw instanceof Vehicle);
            System.out.println(myCar.color);
            System.out.println(myCar.getManufacturer());
            System.out.println(myCar.speedCheck("km/h"));
            System.out.println(myCar.speedCheck("mp/h"));
            //System.out.println(myCar.speedCheck("lol"));
            System.out.println(myCar.getL100km());
            System.out.println(myCar.getTotalConsumptionOfDistance(300));
            System.out.println(myLkw.getTotalConsumptionOfDistance(300));
        }


}
