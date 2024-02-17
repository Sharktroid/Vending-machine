import java.util.Hashtable;
import java.util.Scanner;


public class VendingMachine {
    private Hashtable<String, Double> snacks;
    private static Scanner scan;
    private static String snackChoice;

    public VendingMachine() {
        scan =  new Scanner(System.in);
        snackChoice = "";
        snacks = new Hashtable<String, Double>();
        snacks.put("Doritos", 2.24);
        snacks.put("Oreo", 2.49);
        snacks.put("M&M's", 1.99);
        snacks.put("Lay's", 3.24);
        snacks.put("Cheetos", 2.99);
    }
    public static void main(String[] args) {
        System.out.println("We're happy you decided to use our Vending Machine today!");
        System.out.println("Please select a snack to buy:");
        snackChoice = scan.next();
        //I have no idea what a Hashtable is. Sorry :(
    }
}