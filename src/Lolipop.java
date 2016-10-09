/**
 * Created by D1mD1m on 10/9/2016.
 */
public class Lolipop extends Sweet {
    int lenghtOfStick;
    Lolipop(Packing packing, String name, int sugar, int weight, int lenghtOfStick){
        super(packing, name, sugar, weight);
        this.lenghtOfStick = lenghtOfStick;
    }

    private int getLenghtOfStick(){
        return this.lenghtOfStick;
    }
    public void showSweet(){
        System.out.println("It is the Lollipop!");
        System.out.println("Name:" + this.getName());
        System.out.println("Weigth" + this.getWeight());
        System.out.println("StickLenght:" + this.getLenghtOfStick());
        System.out.println("Packing:" + this.getPacking());
        System.out.println("SugarContain:" + this.getSugar());
    }
}
