import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public enum ClassicSweetsNames {MARS, REDPOPPY, KARAKUM, METEOR, BEAR_ON_THE_NORTH, GOLDEN_KEY, COW, GULIVER;
    public static ClassicSweetsNames randomName() {
        int pick = new Random().nextInt(ClassicSweetsNames.values().length);
        return ClassicSweetsNames.values()[pick];
    }
}
