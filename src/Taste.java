import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public enum Taste { STRAWBERRY, COLA, APPLE, BUBBLE_GUM;
    public static Taste randomTaste() {
        int pick = new Random().nextInt(Taste.values().length);
        return Taste.values()[pick];
    }
}
