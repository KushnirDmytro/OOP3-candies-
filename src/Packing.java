import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public enum Packing { FOIL, PAPER, PLASTIC, NONE;
    public static Packing randomPacking() {
        int pick = new Random().nextInt(Packing.values().length);
        return Packing.values()[pick];
    }
}
