/**
 * Created by D1mD1m on 10/9/2016.
 */
abstract class Sweet {
    private Packing packing;
    private String name;
    private int sugar;
    private int weight;
    Sweet(){

    }
    Sweet(Packing packing, String name, int sugar, int weight){
        this.name = name;
        this.packing = packing;
        this.sugar = sugar;
        this.weight = weight;
    }
    public int getSugar(){
        return this.sugar;
    }
    public String getName(){
        return this.name;
    }
    public Packing getPacking(){
        return packing;
    }
    public int getWeight(){
        return weight;
    }

    public abstract void showSweet();
}
