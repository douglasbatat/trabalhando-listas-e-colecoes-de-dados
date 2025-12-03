import java.time.LocalDate;

public class PerishableProduct extends Product{
    private LocalDate expirationDate;

    public PerishableProduct(String name, double price, int quantity, int expirationDate) {
        super(name, price, quantity);
    }
}
