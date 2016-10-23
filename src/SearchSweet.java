import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by D1mD1m on 10/23/2016.
 */
public abstract class SearchSweet {

    private static SweetSearchSpec refineSearchReqest(SweetSearchSpec rawSearchReq) {
        if (rawSearchReq.getName().equals("") || rawSearchReq.getName() == null ||
                rawSearchReq.getName().equals(SweetsNamesClassic.UNNDEFINED.toString())) {
            rawSearchReq.setName(SweetsNamesClassic.UNNDEFINED.toString());
            ;
        }
        if (rawSearchReq.getPacking().toString().equals("") || rawSearchReq.getPacking() == null ||
                rawSearchReq.getPacking().equals(Packing.UNDEFINED) ||
                rawSearchReq.getPacking().toString().equals(Packing.UNDEFINED.toString())) {
            rawSearchReq.setPacking(Packing.UNDEFINED);
        }
        return rawSearchReq;
    }

    public static ArrayList<Sweet> getSweets(SweetSearchSpec searchReq, ArrayList<Sweet> sweets) {
        ArrayList<Sweet> reqestResults;
        reqestResults = new ArrayList<Sweet>();
        searchReq = refineSearchReqest(searchReq);
        Sweet sweet = null; // buffer
        for (Iterator i = sweets.iterator(); i.hasNext(); ) {
            sweet = (Sweet) i.next();
            if (searchReq.getPacking().equals(Packing.UNDEFINED) ||
                    !searchReq.getPacking().equals(Packing.UNDEFINED) && !sweet.getPacking().equals(searchReq.getPacking())) {
                continue;
            }
            if (searchReq.getName().equals(SweetsNamesClassic.UNNDEFINED.toString()) ||
                    !searchReq.getName().equals(SweetsNamesClassic.UNNDEFINED.toString()) && !searchReq.getName().equals(sweet.getName())) {
                continue;
            }

            if (searchReq.sugarFrom > sweet.getSugar() || sweet.getSugar() > searchReq.sugarTo) {
                continue;
            }
            if (searchReq.weightFrom > sweet.getWeight() || sweet.getWeight() > searchReq.weightTo) {
                continue;
            }
            reqestResults.add(sweet);
        }
        return reqestResults;
    }
}

