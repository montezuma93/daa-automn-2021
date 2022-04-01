import aufgabe010422.Bank;
import aufgabe010422.Customer;
import aufgabe2_010422.Airport;
import aufgabe2_010422.AirportCompany;

public class Application {

        public static void main(String args[]) throws Exception {
                //Bank sparkasse = new Bank();
                //Customer karlHeinz = new Customer("Karl", "Heinz", 123456, -500);
                //karlHeinz.deposit(100);
                Airport berlin = new Airport("Berlin");
                Airport paris = new Airport("Paris");
                Airport london = new Airport("London");
                Airport rom = new Airport("Rom");

                berlin.connections.add(paris);
                berlin.connections.add(london);
                berlin.connections.add(rom);

                AirportCompany condor = new AirportCompany("Condor");
                condor.airportNetworks.add(berlin);
                condor.airportNetworks.add(paris);
                condor.airportNetworks.add(london);
                condor.airportNetworks.add(rom);

                condor.exsistConnection(berlin, paris);

        }
}
