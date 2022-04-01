import aufgabe010422.Bank;
import aufgabe010422.Customer;
import aufgabe2_010422.Airport;
import aufgabe2_010422.AirportCompany;

public class Application {

        public static void main(String args[]) throws Exception {
                //Bank sparkasse = new Bank();
                //Customer karlHeinz = new Customer("Karl", "Heinz", 123456, -500);
                //karlHeinz.deposit(100);

                // List of Airports
                Airport berlin = new Airport("Berlin");
                Airport paris = new Airport("Paris");
                Airport london = new Airport("London");
                Airport rom = new Airport("Rom");
                Airport newYork = new Airport("New York");
                Airport kairo = new Airport("Kairo");
                Airport peking = new Airport("Peking");
                Airport shanghai = new Airport("Shanghai");

                // Connections from Airport Berlin
                berlin.connections.add(paris);
                berlin.connections.add(london);
                berlin.connections.add(rom);
                berlin.connections.add(peking);
                berlin.connections.add(shanghai);

                //Connections from Airport Paris
                paris.connections.add(berlin);
                paris.connections.add(london);
                paris.connections.add(rom);
                paris.connections.add(kairo);
                paris.connections.add(newYork);

                //Connections from Airport London
                london.connections.add(berlin);
                london.connections.add(paris);
                london.connections.add(newYork);
                london.connections.add(rom);

                //Connections from Airport Rom
                rom.connections.add(london);

                //Connections from Airport New York
                newYork.connections.add(london);

                //Connections from Airport Kairo
                kairo.connections.add(paris);

                //Connections from Airport Shanghai
                shanghai.connections.add(berlin);

                //Connections from Airport Peking
                peking.connections.add(shanghai);
                peking.connections.add(berlin);


                AirportCompany condor = new AirportCompany("Condor");
                condor.airportNetworks.add(berlin);
                condor.airportNetworks.add(paris);
                condor.airportNetworks.add(london);
                condor.airportNetworks.add(rom);
                condor.airportNetworks.add(kairo);
                condor.airportNetworks.add(newYork);
                condor.airportNetworks.add(shanghai);
                condor.airportNetworks.add(peking);




                System.out.println("Please chose your Destination Airport: (Berlin, Paris, London, Rom, Kairo, New York, " +
                                "Shanghai, Peking?");

                //System.console().readLine();

                System.out.println("Please chose your Departure Airport: (Berlin, Paris, London, Rom, Kairo, New York, " +
                        "Shanghai, Peking?");

                //System.console().readLine();

                condor.exsistConnection(berlin, rom);
                System.out.println("Route available");

        }
}
