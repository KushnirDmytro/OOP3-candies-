import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public enum Taste {
    STRAWBERRY, COLA, APPLE, BUBBLE_GUM, UNDEFINED;

    @Override
    public String toString() {
        switch (this) {
            case STRAWBERRY:
                return "strawberry";
            case COLA:
                return "Cola";
            case APPLE:
                return "apple";
            case BUBBLE_GUM:
                return "bubble gum";
            default:
                return "Undefined";
        }
    }

    public static Taste randomTaste() {
        int pick = new Random().nextInt(Taste.values().length - 1);
        return Taste.values()[pick];
    }
}
