/**
 * Created by D1mD1m on 10/23/2016.
 */
public class SweetSearchSpec extends SweetSpec {
    int sugarFrom = 0;
    int sugarTo = Integer.MAX_VALUE;
    int weightFrom = 0;
    int weightTo = Integer.MAX_VALUE;

    SweetSearchSpec() {
        super();
    }

    SweetSearchSpec(String name, Packing pack, int sugarFrom, int sugarTo, int weightFrom, int weightTo) {
        super(name, pack, 0, 0);
        this.weightFrom = weightFrom;
        this.weightTo = weightTo;
        this.sugarFrom = sugarFrom;
        this.sugarTo = sugarTo;
    }

    SweetSearchSpec(SweetSpec spec, int sugarFrom, int sugarTo, int weightFrom, int weightTo) {
        this(spec.getName(), spec.getPacking(), sugarFrom, sugarTo, weightFrom, weightTo);
    }
}
