package monopoly;

public class Field {
    String name;
    int price;
Player player;
boolean ownerShip;

    public Field (String name, int price) {
        this.ownerShip=false;
        this.name = name;
        this.price = price;
    }
}
