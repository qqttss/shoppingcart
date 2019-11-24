package shoppingcartv1;

import java.util.HashMap;

public class Checkout {

    /** Map contains product prices with key being product name and value being price */
    private final HashMap<String, Double> basePrices;
    private double totalPrice = 0;

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
     * @param listOfItems the list of purchased items
     */
    public double calculatePrice(String[] listOfItems) {
        double sum = 0;

        for (String item : listOfItems) {
            double price = basePrices.getOrDefault(item, 0.0);
            sum += price;
        }

        this.totalPrice = sum;
        return sum;
    }

    /**
     * Calculate discount for individual item
     *
     * @param listOfItems the list of purchased items
     * @param product name of the discount product
     * @param minAmount the minimum amount ro get the discount
     * */
    public double discount(String[] listOfItems, String product, int minAmount) {
        double sum = 0d;
        int count = 0;

        for (String item : listOfItems) {
            if (item.equals(product)) {
                count++;
            }
        }

        sum = this.totalPrice - count/minAmount * basePrices.getOrDefault(product, 0d);
        this.totalPrice = sum;
        return sum;
    }
}
