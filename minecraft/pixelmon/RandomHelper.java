package pixelmon;

import java.util.Random;

public class RandomHelper {
	static Random rand = new Random();

	public static int getRandomNumberBetween(int min, int max) {
		return rand.nextInt(max-min +1) + min;
	}
}
