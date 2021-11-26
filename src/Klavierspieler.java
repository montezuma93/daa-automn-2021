public class Klavierspieler extends Musikspieler {

    Klavierspieler(String nameM, int alterM) {
        super(nameM, alterM);
        instrument = new Klavier();
    }


}
