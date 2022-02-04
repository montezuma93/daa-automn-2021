package monopoly;

public class Player {
    int currency;
    String name;
    public Player(String name,int currency){
        this.name=name;
        this.currency=currency;

    }
    public void buy(Field fieldToBuy){
        System.out.println(fieldToBuy.player);
        fieldToBuy.player=this;
        System.out.println(fieldToBuy.player);
    }
}

