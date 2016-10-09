import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public class SweetsRandomFactory {

    private enum SweetsKinds{CANDY, LOLLIPOP, CHOCOLATE;
        public static SweetsKinds randomKind() {
            int pick = new Random().nextInt(SweetsKinds.values().length);
            return SweetsKinds.values()[pick];
        }
    }


    public static Sweet createRandomSweet(){
        Sweet newSweet;
        Random rn = new Random();
        int thisWeight = rn.nextInt(200);
        int thisSugar = rn.nextInt(100);
        Packing thisPack = Packing.randomPacking();
        SweetsKinds thisKind = SweetsKinds.randomKind();
        String thisName = ClassicSweetsNames.randomName().toString();
        switch (thisKind){
            case CANDY:
                Color thisColor = Color.randomColor();
                Taste thisTaste = Taste.randomTaste();
                newSweet = new Candy(thisPack,  thisName, thisSugar, thisWeight, thisTaste, thisColor);
                break;
            case CHOCOLATE:
                int thisChocolate = rn.nextInt(100);
                newSweet = new Chocolate(thisPack,  thisName, thisSugar, thisWeight, thisChocolate);
                break;
            default:
                int lolliLength = rn.nextInt(25);
                newSweet = new Lolipop(thisPack,  thisName, thisSugar, thisWeight, lolliLength);
        }
        return newSweet;
    }

}
