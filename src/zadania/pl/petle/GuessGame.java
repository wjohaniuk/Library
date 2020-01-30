package zadania.pl.petle;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int number = 200;
        int userInput;
        //System.out.println("Zgadnij liczbe");

//
//        while ((userInput = scanner.nextInt()) != number) {
//            if (userInput > number) {
//                System.out.println("Podana liczba jest zbyt duża");
//            }else{
//                    System.out.println("Podana liczba jest zbyt mała");
//                }
//            }



        do {
            System.out.println("Zgadnij liczbe");
            userInput = scanner.nextInt();
            if (userInput > number) {
                System.out.println("Podana liczba jest zbyt duża");
            } else if (userInput<number){
                System.out.println("Podana liczba jest zbyt mała");
            }
        } while ((userInput) != number);

        System.out.println("Trafiłeś");

    }
}
