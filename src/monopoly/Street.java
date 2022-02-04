package monopoly;

public class Street extends Field{
    String color;

    public Street (String color, String name, int price) {
        super(name, price);
        this.color = color;
    }
}
