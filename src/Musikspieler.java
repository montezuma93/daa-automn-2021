public class Musikspieler {

    String name;
    int alter;
    Instrument instrument;

    Musikspieler (String nameM, int alterM){
        this.name = nameM;
        this.alter = alterM;
    }
    void birthday(){
        int neuesAlter = alter+1;
        setAlter(neuesAlter);
    }
    void setAlter(int neuesAlter){
        alter = neuesAlter;
    }
    int getAlter(){
        return alter;
    }

    void playInstrument() {
        instrument.play();
    }
}
