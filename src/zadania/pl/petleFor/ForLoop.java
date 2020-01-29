package zadania.pl.petleFor;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] numbers = {1,2,3,4,5};
////
        for (int i = 0; i < 3; i++) {
            System.out.println("Sprawdź czy liczba jest parzysta");
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println("liczba " + a + " jest parzysta");
                break;
            } else {
                System.out.println("liczba " + a + " jest nieparzysta");
            }

    }scanner.close();
//        for (int element:numbers){
//            System.out.println(element);
//        }
        }

    }
