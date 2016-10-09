import static java.lang.Math.min;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public class SweetPresent {
    private int weight;
    private int size;
    private Sweet[] contains;
    private DifferentSweets whatSweets;

    SweetPresent(int size){
        contains = new Sweet[size];
        this.size = size;
        for (int i = 0; i < size; ++i){
            contains[i] = SweetsRandomFactory.createRandomSweet();
        }
        this.whatSweets = getContain();
        this.weight = countWeight();
    }

    public Sweet giveTheCandyOfSugar(int sugarFrom, int sugarTo){
        int minDifference = 10000;
        int thisSweetness;
        int currentDifference;
        for (int i = 0 ; i < this.size; ++i){
            thisSweetness = contains[i].getSugar();
            if ( (thisSweetness >= sugarFrom) && (thisSweetness <= sugarFrom) ){
                System.out.println("Here is your Sweet!");
                return this.getSweet(i);
            }
            if (thisSweetness < sugarFrom){
                currentDifference = sugarFrom - thisSweetness;
            }
            else{
                currentDifference = thisSweetness - sugarTo;
            }
            minDifference = min(minDifference, currentDifference);
        }
        System.out.println("Sorry, kid, but there is no sweet you're looking for");
        System.out.println("Closest sugar contain is " + minDifference);
        return null;
    }

    private class DifferentSweets {
        int candies = 0;
        int chockolets = 0;
        int lolipops = 0;
    }

    private DifferentSweets getContain(){
        DifferentSweets ds = new DifferentSweets();
        for (int i = 0; i < this.size; ++i){
            if ( this.contains[i].getClass().getName().equals("Candy") ){
                ds.candies++;
            }
            else if (this.contains[i].getClass().getName().equals("Lolipop")){
                ds.lolipops ++;
            }
            else ds.chockolets++;
        }
        return ds;
    }
    private int countWeight(){
        int totalWeight = 0;
        for (int i = 0; i < this.size; ++i){
            totalWeight += this.contains[i].getWeight();
        }
        return totalWeight;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getCandies(){
        return this.whatSweets.candies;
    }
    public int getChockolates(){
        return this.whatSweets.chockolets;
    }
    public int getLolipops(){
        return this.whatSweets.lolipops;
    }
    public int getSize(){
        return this.size;
    }
    private Sweet getSweet(int number){
        return contains[number];
    }

}
