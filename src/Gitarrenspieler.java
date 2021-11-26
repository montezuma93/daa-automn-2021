public class Gitarrenspieler extends Musikspieler {

    Gitarrenspieler (String nameG, int alterG){
        super(nameG, alterG);
        instrument = new Gitarre();
    }

    String getName(){
        return name;
    }

    void setName(String lolName){
        name = lolName;
    }

}
