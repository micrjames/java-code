import java.util.Random;

public class DiceRoller {
    Random random; 
    DiceRoller() {
	    random = new Random();
	}

	int roll() {
	    return random.nextInt(6) + 1;
	}
}
