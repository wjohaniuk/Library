package zadania.pl.petle;

import java.util.Scanner;

public class UserNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyNumbers;
        int sum = 0;

        System.out.println("Podaj ile liczb, chcesz wprowadzic:");
        howManyNumbers = scanner.nextInt();


        while (howManyNumbers-- > 0) {
            System.out.println("Podaj libcze: ");
            sum = sum + scanner.nextInt();
        }
        System.out.println("Suma wszystkich liczb to: " + sum);
        scanner.close();
    }
}
