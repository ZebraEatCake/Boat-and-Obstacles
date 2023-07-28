import java.util.Random;

public class River {
    String[] riverTrack = new String[100];
    Boat boat1 = new Boat();
    Boat boat2 = new Boat();

    public River() {
        Random random = new Random();
        for (int i = 0; i < riverTrack.length; i++) {
            int randNum = random.nextInt(8);
            if (randNum == 0) {
                riverTrack[i] = "C"; // Current
            } else if (randNum == 1) {
                riverTrack[i] = "#"; // Trap
            } else {
                riverTrack[i] = " "; // Empty
            }
        }
    }

    public String getObstacle(int position) {
        return riverTrack[position];
    }

    public void printRiver(Player player1) {
    	System.out.println();
        for (int i = 0; i < riverTrack.length; i++) {
            if (i == boat1.getPosition()) {
                System.out.print(player1.getName() + "|");
            } else if (i == boat2.getPosition()) {
            	System.out.print("Bot|");
            } else {
                System.out.print(riverTrack[i] + "|");
            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("Position of %s: %d\n",player1.getName(), (boat1.getPosition() + 1));
        System.out.println("Position of Bot: " + (boat2.getPosition() + 1));
        System.out.println();
    }
}




