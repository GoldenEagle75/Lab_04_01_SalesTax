public class Main {
    public static void main(String[] args) {
        double purchasePrice = 100.00;
        double taxRate = 0.05;
        double salesTax = purchasePrice * taxRate;
        System.out.println("The cost of your purchase before tax was " + purchasePrice + ". Tax was " + salesTax + ", and thus the total price was " + (purchasePrice+salesTax) + ".");
    }
}