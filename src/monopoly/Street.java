package monopoly;

public class Street extends Field{
    String color;

    public Street (String color, String name, int price) {
        super(name, price);
        this.color = color;
    }
    public int calculateRent(){
        //ToDo: Variablen Häuser auf einer Strasse, Wie hoch ist die Basismiete, Miete pro Haus,
        return 0;
    }
}
