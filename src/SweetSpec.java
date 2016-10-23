import java.util.Random;

/**
 * Created by D1mD1m on 10/22/2016.
 */
public class SweetSpec {

    private Packing packing;
    private String name;
    private int sugar;
    private int weight;

    protected SweetSpec() {
        this.packing = Packing.UNDEFINED;
        this.name = "Undefined";
        this.sugar = 0;
        this.weight = 0;
    }

    protected SweetSpec(String name, Packing packing, int sugar, int weight) {
        this.packing = packing;
        this.name = name;
        this.sugar = sugar;
        this.weight = weight;
    }

    static protected SweetSpec randomSpec() {
        Random rn = new Random();
        Packing thisPack = Packing.randomPacking();
        String thisName = SweetsNamesClassic.randomName().toString();
        int thisWeight = rn.nextInt(200);
        int thisSugar = rn.nextInt(200);
        return new SweetSpec(thisName, thisPack, thisSugar, thisWeight);
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPacking(Packing packing) {
        this.packing = packing;
    }

    public int getSugar() {
        return this.sugar;
    }

    public String getName() {
        return this.name;
    }

    public Packing getPacking() {
        return packing;
    }

    public int getWeight() {
        return weight;
    }

}