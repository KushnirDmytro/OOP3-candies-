/**
 * Created by D1mD1m on 10/9/2016.
 */
public class Candy extends Sweet {
    private Taste taste;
    private Color color;

    Candy() {
        super();
        //this.taste = Taste.UNDEFINED;
        //this.color = Color.UNDEFINED;
    }

    //Candy(SweetSpec sweetSpec, Taste taste, Color color) {

        //CandySweetSpec(sweetSpec, taste, color);
        //this.taste = taste;
        //this.color = color;
    //}

    Candy(CandySweetSpec candySweetSpec){
        //super(candySweetSpec.getName().toString(), candySweetSpec.getPacking(), candySweetSpec.getSugar(), candySweetSpec.getWeight());
        super ((SweetSpec) candySweetSpec);
        this.taste = candySweetSpec.getTaste();
        this.color = candySweetSpec.getColor();
    }

    Candy(String name, Packing packing, int sugar, int weight ,Taste taste,Color color){
        this(new CandySweetSpec(name, packing, sugar, weight, taste, color));
    }

    @Override
    public void showSweet() {
        System.out.println("It is the Candy!");
        super.showSweet();
        System.out.println("Taste: " + this.getTaste());
        System.out.println("Color: " + this.getColor());
        System.out.println("Packing: " + this.getPacking());
    }

    public Taste getTaste() {
        return this.taste;
    }

    public Color getColor() {
        return this.color;
    }
}
