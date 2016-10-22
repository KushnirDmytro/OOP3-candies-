/**
 * Created by D1mD1m on 10/9/2016.
 */
abstract class Sweet {
    private Packing packing;
    private String name;
    private int sugar;
    private int weight;

    Sweet(){
        this(new SweetSpec());
    }

    Sweet(SweetSpec spec){
        this.name = spec.name;
        this.packing = spec.packing;
        this.sugar = spec.sugar;
        this.weight = spec.weight;
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

    public void showSweet(){
        System.out.println("Name: " + this.getName());
        System.out.println("Weigth: " + this.getWeight());
        System.out.println("Packing: " + this.getPacking());
        System.out.println("SugarContain: " + this.getSugar());
    };
}
