/**
 * Created by D1mD1m on 10/25/2016.
 */
public class CandySweetSpec extends SweetSpec {
    private Taste taste;
    private Color color;

    CandySweetSpec(){
        super();
        this.taste = Taste.UNDEFINED;
        this.color = Color.UNDEFINED;
    }
    CandySweetSpec(String name, Packing packing, int sugar, int weight ,Taste taste,Color color){
        super(name, packing, sugar, weight);
        this.taste = taste;
        this.color = color;
    }
    CandySweetSpec (SweetSpec sweetSpec,Taste taste,Color color ){
        super(sweetSpec);
        this.taste = taste;
        this.color = color;
    }


    public Taste getTaste() {
        return taste;
    }

    public Color getColor() {
        return color;
    }
}
