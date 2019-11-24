package shoppingcartv2;

import java.util.HashMap;

public class BasicCheckout implements Checkout {
    /** Map contains product prices with key being product name and value being its price */
    private final HashMap<String, Double> basePrices;

    public BasicCheckout() {
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
    @Override
    public double calculatePrice(String[] listOfItems) {
        double sum = 0;

        for (String item : listOfItems) {
            double price = basePrices.getOrDefault(item, 0.0);
            sum += price;
        }

        return sum;
    }
}
