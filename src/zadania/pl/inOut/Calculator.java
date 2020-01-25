package zadania.pl.inOut;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double b = scanner.nextDouble();
        System.out.println("Podaj działanie w postaci znaków +, -, /, *,: ");
        char sign = scanner.next().charAt(0);
        scanner.close();

        calculate.calculate(a,b,sign);
        calculate.zeroMethod(b, sign);



    }
}
