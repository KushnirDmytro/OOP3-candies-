/**
 * Created by D1mD1m on 10/9/2016.
 */
abstract class Sweet {
    SweetSpec spec;

    /*
    private Packing packing;
    private String name;
    private int sugar;
    private int weight;
    */
    Sweet() {
        this(new SweetSpec());
    }

    Sweet(SweetSpec spec) {
        this.spec = spec;
        /*
        this.name = spec.getName();
        this.packing = spec.getPacking();
        this.sugar = spec.getSugar();
        this.weight = spec.getSugar();
        */
    }

    public SweetSpec getSpec(){
        return this.spec;
    }

    /*
    public int getSugar() {
        return this.sugar;
    }

    public String getName() {
        return this.name;
    }

    public Packing getPacking() {
        return packing;
    }

    public int getWeight() {
        return weight;
    }
    */
    public void showSweet() {
        System.out.println("Name: " + this.spec.getName());
        System.out.println("Weigth: " + this.spec.getWeight());
        System.out.println("Packing: " + this.spec.getPacking());
        System.out.println("SugarContain: " + this.spec.getSugar());
    }

    ;
}
