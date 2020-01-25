package zadania.pl.inOut;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // potrzebny po intach i doublach, żeby pozbyc sie dodatkowego entera
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();

        scanner.close();
        System.out.println("imie: " + name + " " + "nazwisko: " + lastName + " " + "wiek: " + age);
    }
}
