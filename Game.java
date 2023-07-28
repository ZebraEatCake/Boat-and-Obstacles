import java.util.*;

public class Game {
    River river = new River();
    Player player1 = new Player();
    
    public void start() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter player name");
        player1.setName(scan.nextLine());

        river.boat1.setName(player1.getName());
        river.boat2.setName("Bot");

        while (!river.boat1.isWinner() && !river.boat2.isWinner()) {
            System.out.println("Please enter r to roll the dice");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("r")) {
                river.boat1.rollDice();
                if (river.boat1.isWinner()) {
                    break;
                } 
                river.boat2.rollDice();
                if (river.boat2.isWinner()) {
                    break;
                }
                river.printRiver(player1);
            }
        }
    }
}
