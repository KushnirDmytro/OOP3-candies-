import java.util.Scanner;

/**
 * Created by D1mD1m on 10/9/2016.
 */
public class NewYearMirracle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give size of the Present");
        int presentSize= 0;
        if (sc.hasNextInt()){
            presentSize = sc.nextInt();
        }
        SweetPresent ourBox = new SweetPresent(presentSize);
        System.out.println("The Present has " + ourBox.getCandies() + " candies, " + ourBox.getChockolates() + " chocolates ," +
        ourBox.getLolipops() + " lolipops");
        System.out.println("The Present weight is " + ourBox.getWeight());
        ourBox.sortByWeight();
        ourBox.showBoxContain();

        System.out.println("What sugar contain do you want, kid?");
        System.out.print("From:");
        int sugarContainFrom = 0;
        int sugarContainTo = 0;
        if (sc.hasNextInt()){
            sugarContainFrom = sc.nextInt();
        }
        System.out.print("To:");
        if (sc.hasNextInt()){
            sugarContainTo = sc.nextInt();
        }
        Sweet ourCandy = ourBox.giveTheCandyOfSugar(sugarContainFrom, sugarContainTo);
        if (ourCandy != null){
            ourCandy.showSweet();
        }
    }
}
