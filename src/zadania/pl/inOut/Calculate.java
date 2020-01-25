package zadania.pl.inOut;

public class Calculate {
    private double a;
    private double b;
    private char sign;


    public void calculate(double a, double b, char sign){
        switch (sign) {
            case '+':
                System.out.println((a + b));
                break;
            case '-':
                System.out.println((a-b));
                break;
            case '/':
                System.out.println((a/b));
                break;
            case '*':
                System.out.println((a*b));
                break;
            default:
                System.out.println("Podany operator nie istnieje");
        }
    }
    public void zeroMethod(double b, char sign){
        if (b == 0 && sign == '/'){
            System.out.println("Nie wolno dzielić przez 0, zacznij od początku");
        }
    }

}
