package zadania.pl.discountApp;

public class PrintService {
    public void printHelloMsg(Client client, double price, double discountPrice) {
        printWelcomeMsg(client);
        printPriceMsg(price, discountPrice);


    }

    private void printWelcomeMsg(Client client) {
        if (client.getLastName() == null) {
            System.out.println("Witaj " + client.getFirstName());
        } else if (client.getFirstName() == null) {
            System.out.println("Witaj " + client.getLastName());
        } else if (client.getFirstName() == null && client.getLastName() == null) {
            System.out.println("Witaj nieznajomy");
        } else {
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        }
    }

    private void printPriceMsg(double price, double discountPrice) {
        System.out.println("Kwota do zapłaty: " + price);
        System.out.println("Do zapłaty po rabacie: " + discountPrice);
    }

}
