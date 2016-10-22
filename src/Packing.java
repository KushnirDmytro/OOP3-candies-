import java.util.Random;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public enum Packing { FOIL, PAPER, PLASTIC, NONE, UNDEFINED;

    @Override
    public String toString(){
        switch (this){
            case FOIL: return "foil";
            case PAPER: return "paper";
            case PLASTIC: return "plastic";
            case NONE: return "none";
            default: return "Undefined";
        }
    }

    public static Packing randomPacking() {
        int pick = new Random().nextInt(Packing.values().length);
        return Packing.values()[pick];
    }
}
