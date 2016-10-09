/**
 * Created by D1mD1m on 10/9/2016.
 */
public class Chocolate extends Sweet {
    int chockolateContain;
    Chocolate(Packing packing, String name, int sugar, int weight, int chockolatePercentage){
        super(packing, name, sugar, weight);
        this.chockolateContain = chockolatePercentage;
    }

    private int getChockolateContain(){
        return this.chockolateContain;
    }
    public void showSweet(){
        System.out.println("It is the Chocolate!");
        System.out.println("Name:" + this.getName());
        System.out.println("Weigth" + this.getWeight());
        System.out.println("ChocolateContain:" + this.getChockolateContain());
        System.out.println("Packing:" + this.getPacking());
        System.out.println("SugarContain:" + this.getSugar());
    }
}
