package Aufgabe080422;

public  class Calculator {
    public static int ggt(int zahl1, int zahl2) {
        if (zahl1 == zahl2) {
            return zahl1;
        } else {
            int bigNumber;
            int smallNumber;
            if (zahl1 > zahl2) {
                bigNumber = zahl1;
                smallNumber = zahl2;
            } else {
                bigNumber = zahl2;
                smallNumber = zahl1;
            }
            for (int i = bigNumber/2; i>=2; i= i-1){
                if(zahl1 % i == 0 && zahl2 % i == 0){
                    return i;
                }


            }
            return 1;

            }


        }
    }

