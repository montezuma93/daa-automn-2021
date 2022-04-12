package learningreview;

public class Vehicle {
    private String color;
    private double consumption;
    private double drivenDistance;
    private double travelCosts;

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumption(double consumption, double drivenDistance) {
        this.consumption = (consumption/100) * drivenDistance;
        return this.consumption;
    }

    public double getTravelCosts(double consumption, double drivenDistance, double travelCosts) {
        this.travelCosts = ((consumption/100)*drivenDistance)*travelCosts;
        return this.travelCosts;
    }
}
