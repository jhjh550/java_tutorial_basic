import java.util.Random;

public class Player extends Character{

	@Override
	public int attack() {
		Random random = new Random();
		return random.nextInt(100);
	}

}
