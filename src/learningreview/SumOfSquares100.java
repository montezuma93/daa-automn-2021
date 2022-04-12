package learningreview;

public class SumOfSquares100 {

    public static int getSumOfSquares100(int squares){
        int sum1 = 0;
        int sum2= 0;
        int diff;

        for(int i =0; i <= squares; i++){
            sum1 = sum1 + (i*i);
        }
        System.out.println("Summe der Quadrate: " + sum1);

        for(int j =0 ; j<= squares; j++){
            sum2 = sum2 + j;
        }
        sum2 = sum2 * sum2;
        System.out.println("Quadrat der Summe: " + sum2);
        diff = sum2 - sum1;
        System.out.println("Differenz: " + diff);
        return diff;
    }
}
