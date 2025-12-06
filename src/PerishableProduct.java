public class PerishableProduct extends Product{
    private int expirationDate;

    public PerishableProduct(String name, double price, int quantity, int expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }
}
