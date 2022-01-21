package car;
import car.Vehicle;
import java.util.Objects;

public class Car extends Vehicle {
    public Car(String color, String manufacturer, boolean driving, boolean broken, int horsePower, String type, String owner, int year, int doors, double speed, double consumption, double l100km) {
        super(color, manufacturer, driving, broken, horsePower, type, owner, year, doors, 4, speed, consumption, l100km);
    }

    //Constructor einbauen...

    public double speedCheck (String unit) throws Exception {
        if (Objects.equals(unit, "mp/h")) {
            double speedMph = speed * 0.62;
            return speedMph;
        } else if (Objects.equals(unit, "km/h")) {
            return speed;
        } else {
            System.out.println("unit is unknown");
            throw new Exception("Failure");
        }
    }

    @Override
    public double getTotalConsumptionOfDistance(double givenDistance) {
        return 5;
    }
}

