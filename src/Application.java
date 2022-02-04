import car.Car;
import car.Lkw;
import car.Vehicle;
import monopoly.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

        public static void main(String args[]) throws Exception {
            List<String>playerNames = new ArrayList<>();
            System.out.println("Geben Sie die Anzahl der Spieler an");
            Scanner in = new Scanner(System.in);
            int amountOfPlayers = in.nextInt();
            System.out.println("Es werden " + amountOfPlayers + " Spieler mitspielen");
            for(int i = 0; i<amountOfPlayers; i++){
                System.out.println("Geben Sie den Namen von dem " + i + " Spieler an");
                String playerName = in.nextLine();
                playerNames.add(playerName);
            }
            Game game = new Game();
            game.initialize(playerNames);


            // closing scanner
            in.close();



        }


}
