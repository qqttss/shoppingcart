package shoppingcart;

import java.util.HashMap;

public class Checkout {
    private HashMap<String, Double> basePrices;

    public Checkout() {
       basePrices = new HashMap<>();
    }

    public void addProduct(String product, double price) {
        this.basePrices.put(product, price);
    }

    public double calculatePrice(String[] listOfItems) {
        double sum = 0;

        for (String item : listOfItems) {
            double price = basePrices.getOrDefault(item, 0.0);
            sum += price;
        }

        return sum;
    }
}
