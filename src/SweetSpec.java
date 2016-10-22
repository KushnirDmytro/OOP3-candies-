import java.util.Random;

/**
 * Created by D1mD1m on 10/22/2016.
 */
public class SweetSpec {


    protected Packing packing;
    protected String name;
    protected int sugar;
    protected int weight;




    protected SweetSpec(){
        this.packing = Packing.UNDEFINED;
        this.name = "Undefined";
        this.sugar = 0;
        this.weight = 0;
    }

    protected SweetSpec(String name, Packing packing, int sugar, int weight){
        this.packing = packing;
        this.name = name;
        this.sugar = sugar;
        this.weight = weight;
    }

    static protected SweetSpec randomSpec(){
        Random rn = new Random();
        Packing thisPack = Packing.randomPacking();
        String thisName = ClassicSweetsNames.randomName().toString();
        int thisWeight = rn.nextInt(200);
        int thisSugar = rn.nextInt(200);
        return new SweetSpec(thisName, thisPack, thisSugar, thisWeight);
    }
}
