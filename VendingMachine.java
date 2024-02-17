import java.util.Hashtable;

public class VendingMachine {
    private Hashtable<String, Double> snacks;
    public VendingMachine() {
        snacks = new Hashtable<String, Double>();
        snacks.put("Doritos", 2.24);
        snacks.put("Oreo", 2.49);
        snacks.put("M&M's", 1.99);
        snacks.put("Lay's", 3.24);
        snacks.put("Cheetos", 2.99);
    }
    public static void main(String[] args) {

    }
}