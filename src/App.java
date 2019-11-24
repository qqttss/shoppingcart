import shoppingcart.Checkout;

import java.util.HashMap;

public class App {

    public  static void main(String[] args) {
        double sum = 0;
        String[] items = {"Apple", "Apple", "Orange", "Apple"};

        Checkout checkout = new Checkout();

        checkout.addProduct("Apple", 0.6);
        checkout.addProduct("Orange", 0.25);

        sum = checkout.calculatePrice(items);

        System.out.println("Your total changes: \u00a3" + sum);
    }
}
