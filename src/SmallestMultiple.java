//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class SmallestMultiple {

    public static int getSmallestNumber(int number) {
        int kleinsteNummer = 1;
        while (true) {
            boolean kleinsteNummerDurchAllesTeilbar = true;
            for (int i = 1; i <= number; i++) {
                if (kleinsteNummer % i != 0) {
                    kleinsteNummerDurchAllesTeilbar = false;
                }
            }
            if (kleinsteNummerDurchAllesTeilbar) {
                System.out.println(kleinsteNummer);
                return kleinsteNummer;
            } else {
                kleinsteNummer++;
            }
        }
    }



}