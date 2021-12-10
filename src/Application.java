import car.Car;

public class Application {

        public static void main(String args[])
        {
            Car myCar = new Car("Surf Green", "Audi");
            System.out.println(myCar.color);
            System.out.println(myCar.getManufacturer());
        }


}
