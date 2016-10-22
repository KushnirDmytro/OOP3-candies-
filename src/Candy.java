/**
 * Created by D1mD1m on 10/9/2016.
 */
public class Candy extends Sweet {
    private Taste taste;
    private Color color;

    Candy(){
        super();
        this.taste = Taste.UNDEFINED;
        this.color = Color.UNDEFINED;
    }

    Candy(SweetSpec sweetSpec, Taste taste, Color color){
        super(sweetSpec);
        this.taste = taste;
        this.color = color;
    }

    @Override
    public void showSweet(){
        System.out.println("It is the Candy!");
        super.showSweet();
        System.out.println("Taste: " + this.getTaste());
        System.out.println("Color: " + this.getColor());
        System.out.println("Packing: " + this.getPacking());
    }
    public Taste getTaste(){
        return this.taste;
    }
    public Color getColor(){
        return this.color;
    }
}
