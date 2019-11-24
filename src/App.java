import shoppingcart.Checkout;

import java.util.HashMap;

public class App {

    public  static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        String[] items = {"Apple", "Apple", "Orange", "Orange", "Orange"};

        Checkout checkout = new Checkout();

        checkout.addProduct("Apple", 0.6);
        checkout.addProduct("Orange", 0.25);

        sum1 = checkout.calculatePrice(items);

        // Apply discount for Apple
        sum2 = checkout.discount(items, "Apple", 2);

        // Apply discount for Orange
        sum3 = checkout.discount(items, "Orange", 3);

        System.out.println("Your total charges: \u00a3" + sum1);
        System.out.println("Your total charges with discount for Apple: \u00a3" + sum2);
        System.out.println("Your total charges with discount for Apple and Orange: \u00a3" + sum3);
    }
}
