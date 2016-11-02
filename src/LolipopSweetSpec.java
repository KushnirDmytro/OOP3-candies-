/**
 * Created by D1mD1m on 10/25/2016.
 */
public class LolipopSweetSpec extends SweetSpec{
    int lenghtOfStick;

    LolipopSweetSpec(String name, Packing packing, int sugar, int weight, int length){
        super(new SweetSpec(name, packing, sugar, weight));
        this.lenghtOfStick = length;
    }
    LolipopSweetSpec (SweetSpec sweetSpec, int length){
        super(sweetSpec);
        this.lenghtOfStick = length;
    }


    public LolipopSweetSpec() {
        super();
        this.lenghtOfStick = 0;
    }

    public int getLenghtOfStick() {
        return lenghtOfStick;
    }
}
