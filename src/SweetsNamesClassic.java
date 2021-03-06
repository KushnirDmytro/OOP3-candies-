import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public enum SweetsNamesClassic {
    MARS, REDPOPPY, KARAKUM, METEOR, BEAR_ON_THE_NORTH, GOLDEN_KEY, COW, GULIVER, UNNDEFINED;

    @Override
    public String toString() {
        switch (this) {
            case MARS:
                return "Mars";
            case REDPOPPY:
                return "Red poppy";
            case KARAKUM:
                return "Karakum";
            case METEOR:
                return "Meteor";
            case BEAR_ON_THE_NORTH:
                return "Bear on the north";
            case GOLDEN_KEY:
                return "Golden key";
            case COW:
                return "Cow";
            case GULIVER:
                return "Guliver";
            default:
                return "Undefined";
        }
    }

    public static SweetsNamesClassic randomName() {
        int pick = new Random().nextInt(SweetsNamesClassic.values().length - 1);
        return SweetsNamesClassic.values()[pick];
    }

}