package monopoly;

public class Player {
    int currency;
    String name;
    public Player(String name,int currency){
        this.name=name;
        this.currency=currency;

    }
    public void buy(Field fieldToBuy){
        if (!fieldToBuy.ownerShip && this.currency>= fieldToBuy.price){
        System.out.println(currency);
        fieldToBuy.player=this;
        this.currency = this.currency - fieldToBuy.price;
        fieldToBuy.ownerShip=true;
        }else if(this.currency<fieldToBuy.price){
            String message = "Du hast nicht genug Geld um das Feld: %s zu kaufen!";
            System.out.printf((message) + "%n",fieldToBuy.name);
        }
        else {
            String message = "Die Strasse: %s ist bereits durch Spieler %s belegt";
            System.out.printf((message) + "%n",fieldToBuy.name,fieldToBuy.player.name);}

    }
    public void buyHouse(){
        //ToDo: Haus auf einer Strasse hinzufügen, Beachte Strasse Ownership, Limit Häuser,
        //ToDo: Dies ist unsere zweite gemeinsame Änderung
    }
}

