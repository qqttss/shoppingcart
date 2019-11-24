package shoppingcartv2;

public class SimpleOffer extends BasicCheckout {
    private BasicCheckout basicCheckout;
    private String product;
    private int minAmount;
    private double price;

    public SimpleOffer(BasicCheckout basicCheckout, String product, int minAmount, double price) {
        super();
        this.basicCheckout = basicCheckout;
        this.product = product;
        this.minAmount = minAmount;
        this.price = price;
    }

    /**
     * Calculate the total price for the purchase list with discount applied
     *
     * @param listOfItems the list of purchased items
     */
    @Override
    public double calculatePrice(String[] listOfItems) {
        double sum = 0d;
        int count = 0;

        for (String item : listOfItems) {
            if (item.equals(this.product)) {
                count++;
            }
        }

        sum = basicCheckout.calculatePrice(listOfItems) - count/minAmount * this.price;
        return sum;
    }
}
