import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public class SweetsRandomFactory {
    protected enum SweetsKinds {
        CANDY, LOLLIPOP, CHOCOLATE;

        public static SweetsKinds randomKind() {
            int pick = new Random().nextInt(SweetsKinds.values().length);
            return SweetsKinds.values()[pick];
        }

        @Override
        public String toString() {
            switch (this) {
                case CANDY:
                    return "candy";
                case LOLLIPOP:
                    return "lollipop";
                case CHOCOLATE:
                    return "chocolate";
                default:
                    return "Undefined";
            }
        }
    }


    protected static Sweet createRandomSweet() {
        SweetSpec newSweetSpec;
        Sweet newSweet;
        Random rn = new Random();
        SweetsKinds thisKind = SweetsKinds.randomKind();
        newSweetSpec = SweetSpec.randomSpec();
        switch (thisKind) {
            case CANDY:
                Color thisColor = Color.randomColor();
                Taste thisTaste = Taste.randomTaste();
                newSweet = new Candy(newSweetSpec, thisTaste, thisColor);
                break;
            case CHOCOLATE:
                int thisChocolate = rn.nextInt(100);
                newSweet = new Chocolate(newSweetSpec, thisChocolate);
                break;
            default:
                int lolliLength = rn.nextInt(25);
                newSweet = new Lolipop(newSweetSpec, lolliLength);
                break;
        }
        return newSweet;
    }

}
