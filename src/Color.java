import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public enum Color {
    RED, GREEN, BLUE, YELLOW, UNDEFINED;

    public static Color randomColor() {
        int pick = new Random().nextInt(Color.values().length - 1);
        return Color.values()[pick];
    }

    @Override
    public String toString() {
        switch (this) {
            case RED:
                return "red";
            case GREEN:
                return "green";
            case BLUE:
                return "blue";
            case YELLOW:
                return "yellow";
            default:
                return "Undefined";
        }
    }

}
