import aufgabe010422.Bank;
import aufgabe010422.Customer;

public class Application {

        public static void main(String args[]) throws Exception {
                Bank sparkasse = new Bank();
                Customer karlHeinz = new Customer("Karl", "Heinz", 123456, -500);
                karlHeinz.deposit(100);

        }
}
