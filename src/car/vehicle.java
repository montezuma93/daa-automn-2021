package Car;

abstract public class Vehicle {
    //Atribut die Farbe beschreibt
    public String color;

    //getter und setter
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    //Atribut die Name von Auto Marke. String ist ein Variablen Typ - Beispiel : "jfsodfksnj"
    private String manufacturer;
    //ob das Auto funktioniert
    boolean driving;
    //ob das Auto kaputt ist
    boolean broken;
    //int ist ein VariablenTyp Beispiel: 1 223 4334 3423
    int horsePower;
    String type;
    //int bezeichnet eine Jahres zahl
    int year;
    String owner;
    int doors;
    int tires;

    //km/h
    double speed;

    double consumption;

    public double getL100km() {
        return l100km;
    }

    double l100km;

    public Vehicle(String color, String manufacturer, boolean driving, boolean broken, int horsePower, String type,
               String owner, int year, int doors, int tires, double speed, double consumption, double l100km) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.driving = driving;
        this.broken = broken;
        this.horsePower = horsePower;
        this.type = type;
        this.owner = owner;
        this.doors = doors;
        this.tires = tires;
        this.year = year;
        this.speed = speed;
        this.consumption = consumption;
        this.l100km = l100km;
    }

    public double getTotalConsumptionOfDistance (double givenDistance) {
        return givenDistance / 100 * l100km;

}
}
