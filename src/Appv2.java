import shoppingcartv2.BasicCheckout;
import shoppingcartv2.SimpleOffer;

public class Appv2 {
    public  static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        String[] items = {"Apple", "Apple", "Orange", "Orange", "Orange"};

        // Initialize BaicCheckout and add product price
        BasicCheckout checkout = new BasicCheckout();
        checkout.addProduct("Apple", 0.6);
        checkout.addProduct("Orange", 0.25);

        // Do basic checkout
        sum1 = checkout.calculatePrice(items);
        System.out.println("Your total charges: \u00a3" + sum1);

        // Apply discount for Apple
        checkout = new SimpleOffer(checkout, "Apple", 2, 0.6);
        sum2 = checkout.calculatePrice(items);
        System.out.println("Your total charges with discount for Apple: \u00a3" + sum2);

        // Apply discount for Orange further
        checkout = new SimpleOffer(checkout, "Orange", 3, 0.25);
        sum3 = checkout.calculatePrice(items);
        System.out.println("Your total charges with discount for Apple and Orange: \u00a3" + sum3);
    }
}
