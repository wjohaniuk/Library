package zadania.pl.discountApp;

public class DiscountService {
    public double calculateDiscountPrice(Client client, double price) {
        if (client.isClientPremium()) {
            return calculatePremiumDiscount(price);
        } else
            return calculateStandardDiscount(price);
    }

    private double calculateStandardDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.10);
        } else
            return price;
    }

    private double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.15);
        } else {
            return applyDiscount(price, 0.05);
        }
    }

    double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }
}
