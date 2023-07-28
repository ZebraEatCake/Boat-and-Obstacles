import java.util.*;
public class Boat {
    private String name;
    private int position = -1;
    private int score;
    private boolean isWinner;
    private int roll;
    private Encounter encounter;
    

    public void rollDice() {
        Random r = new Random();
        roll = r.nextInt(6) + 1;
        position+=roll;
        System.out.printf("%s rolls a %d\n", name, roll);
    }
    
	public boolean isWinner() {
		if (position>=100) {
			System.out.printf("%s Wins!", name);
			score++;
			return true;
		}
		else
			return false;
	
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}


}
