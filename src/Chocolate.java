/**
 * Created by D1mD1m on 10/9/2016.
 */
public class Chocolate extends Sweet {
    int chockolateContain;

    Chocolate(){
        super();
        this.chockolateContain = 0;
    }

    Chocolate(SweetSpec sweetSpec, int chockolatePercentage){
        super(sweetSpec);
        this.chockolateContain = chockolatePercentage;
    }

    private int getChockolateContain(){
        return this.chockolateContain;
    }

    @Override
    public void showSweet(){
        System.out.println("It is the Chocolate!");
        super.showSweet();
        System.out.println("ChocolateContain: " + this.getChockolateContain());
        System.out.println("Packing: " + this.getPacking());
    }
}
