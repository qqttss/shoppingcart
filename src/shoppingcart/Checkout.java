package shoppingcart;

import java.util.HashMap;

public class Checkout {

    /** Map contains product prices with key being product name and value being price */
    private HashMap<String, Double> basePrices;

    public Checkout() {
       basePrices = new HashMap<>();
    }
    /**
     * Add a new product and its price
     *
     * @param product: the product name
     * @param price: the product price
     * */
    public void addProduct(String product, double price) {
        this.basePrices.put(product, price);
    }

    /**
     * Calculate the total price for the purchase list
     *
     * @param listOfItems: the list of purchased items
     */
    public double calculatePrice(String[] listOfItems) {
        double sum = 0;

        for (String item : listOfItems) {
            double price = basePrices.getOrDefault(item, 0.0);
            sum += price;
        }

        return sum;
    }
}
