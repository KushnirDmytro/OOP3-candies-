import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public enum Color { RED, GREEN, BLUE, YELLOW;
    public static Color randomColor() {
        int pick = new Random().nextInt(Color.values().length);
        return Color.values()[pick];
    }
}
