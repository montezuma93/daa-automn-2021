package monopoly;

public class Player {
    int currency;
    String name;
    public Player(String name,int currency){
        this.name=name;
        this.currency=currency;

    }
    public void buy(Field fieldToBuy){
        if (!fieldToBuy.ownerShip){
        System.out.println(currency);
        fieldToBuy.player=this;
        this.currency = this.currency - fieldToBuy.price;
        fieldToBuy.ownerShip=true;
        }
        else {
            String message = "Die Strasse: %s ist bereits durch Spieler %s belegt";
            System.out.printf((message) + "%n",fieldToBuy.name,fieldToBuy.player.name);}

    }
}

