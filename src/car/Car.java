package car;

public class Car {
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

    //Constructor einbauen...
    public Car(String color, String manufacturer){
        this.color = color;
        this.manufacturer = manufacturer;
    }

}

