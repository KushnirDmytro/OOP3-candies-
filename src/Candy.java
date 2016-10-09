/**
 * Created by D1mD1m on 10/9/2016.
 */
public class Candy extends Sweet {
    public Taste taste;
    public Color color;
    Candy(Packing packing, String name, int sugar, int weight, Taste taste, Color color){
        super(packing, name, sugar, weight);
        this.taste = taste;
        this.color = color;
    }
    public void showSweet(){
        System.out.println("It is the Candy!");
        System.out.println("Name:" + this.getName());
        System.out.println("Weigth" + this.getWeight());
        System.out.println("Taste:" + this.getTaste());
        System.out.println("Color:" + this.getColor());
        System.out.println("Packing:" + this.getPacking());
        System.out.println("SugarContain:" + this.getSugar());
    }
    private Taste getTaste(){
        return this.taste;
    }
    private Color getColor(){
        return this.color;
    }
}
