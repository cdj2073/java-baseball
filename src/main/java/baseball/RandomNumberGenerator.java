package baseball;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int RANDOM_NUMBER_BOUND = 10;

    @Override
    public int generate() {
        Random random = new Random();
        return random.nextInt(RANDOM_NUMBER_BOUND);
    }
}