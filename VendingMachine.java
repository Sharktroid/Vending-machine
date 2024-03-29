import java.util.Hashtable;
import java.util.Scanner;


public class VendingMachine {
    // Snacks are located here so they can be accessed by a static function
    public static Hashtable<String, Double> getSnacks() {
        Hashtable<String, Double> snacks = new Hashtable<String, Double>();
        snacks.put("Doritos".toLowerCase(), 2.24);
        snacks.put("Oreos".toLowerCase(), 2.49);
        snacks.put("M&M's".toLowerCase(), 1.99);
        snacks.put("Lay's".toLowerCase(), 3.24);
        snacks.put("Cheetos".toLowerCase(), 2.99);
        return snacks;

    }

    public static Boolean isSnack(String snack) {
        // Checks if the string is a valid snack
        // Returns true if it is, false if it is not
        return getSnacks().containsKey(snack.toLowerCase());
    }

    public static Double getSnackCost(String snack) {
        // Returns the cost of the inputted snack
        return getSnacks().get(snack.toLowerCase());
    }

    public static void main(String[] args) {
        double moneyInserted = 0.0;
        //Gives user directions on picking a snack
        Scanner scan = new Scanner(System.in);
        System.out.println("We're happy you decided to use our Vending Machine today!");
        System.out.print("Please select a snack to buy: ");
        String snackChoice = scan.nextLine();

        if (isSnack(snackChoice)) {
            Double snackCost = getSnackCost(snackChoice);
            System.out.println(String.format("That snack costs $%s", snackCost.toString()));

            //Asks user for an amount of dollar bills
            System.out.println("How many dollar bills would you like to insert?");

            //Holds the money that the user inserted into the machine
            moneyInserted = Double.valueOf(scan.nextInt());
            if (moneyInserted < snackCost) {
                System.out.println("Not enough");
            }
            else if (moneyInserted > snackCost) {
                Double difference = Double.valueOf(Math.round((moneyInserted - snackCost) * 100))/100;
                System.out.println(String.format("You gave too much. Here's the change: $%s", difference.toString()));
            }
            scan.nextLine();
            System.out.println("Confirm transaction? type 'yes' or 'no'");
            if(scan.nextLine().toUpperCase().equals("YES")) {
                System.out.println("Thank you for your purchase of " + snackChoice);
            }
            else {
                System.out.println(String.format("$%s refunded.", snackCost.toString()));
            }
        }
        else {
            System.out.println("Invalid Snack");
        }

        scan.close();
    }
}