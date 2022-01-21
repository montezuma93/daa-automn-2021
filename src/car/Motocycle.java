package car;

public class Motocycle extends Car.Vehicle {

    public Motocycle(String color, String manufacturer, boolean driving, boolean broken, int horsePower, String type, String owner, int year, int doors, double speed, double consumption, double l100km) {
        super(color, manufacturer, driving, broken, horsePower, type, owner, year, doors, 2, speed, consumption, l100km);
    }
}
