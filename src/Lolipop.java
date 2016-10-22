/**
 * Created by D1mD1m on 10/9/2016.
 */
public class Lolipop extends Sweet {
    int lenghtOfStick;

    Lolipop(){
        super();
        this.lenghtOfStick = 0;
    }

    Lolipop(SweetSpec sweetSpec, int lenghtOfStick){
        super(sweetSpec);
        this.lenghtOfStick = lenghtOfStick;
    }

    private int getLenghtOfStick(){
        return this.lenghtOfStick;
    }

    @Override
    public void showSweet(){
        System.out.println("It is the Lollipop!");
        super.showSweet();
        System.out.println("StickLenght: " + this.getLenghtOfStick());
        System.out.println("Packing: " + this.getPacking());
    }
}
