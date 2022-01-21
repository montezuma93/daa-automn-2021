import Car.Car;

public class Application {

        public static void main(String args[]) throws Exception {
            Car myCar = new Car("Surf Green", "Audi", true, false, 150,
                    "Cabrio", "Enes", 2010, 2, 4, 250,11.2, 11);
            System.out.println(myCar.color);
            System.out.println(myCar.getManufacturer());
            System.out.println(myCar.speedCheck("km/h"));
            System.out.println(myCar.speedCheck("mp/h"));
            //System.out.println(myCar.speedCheck("lol"));
            System.out.println(myCar.getL100km());
            System.out.println(myCar.getTotalConsumptionOfDistance(300));
        }


}
