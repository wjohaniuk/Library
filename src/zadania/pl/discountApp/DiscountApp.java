package zadania.pl.discountApp;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null, null, true);
        double price = 2001;
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price);
        PrintService printService = new PrintService();
        printService.printHelloMsg(client1,price,discountPrice);



        Client client2 = new Client("Jan", "Tomasz", false);
        double price2 = 15011;
        double discountPrice2 = discountService.calculateDiscountPrice(client2, price2);
        printService.printHelloMsg(client2,price2,discountPrice2);



    }


}
