package zadania.pl.hospitalApp;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int exit = 0;
        final int addPatient = 1;
        final int printPatient = 2;
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println(exit + " - exit");
            System.out.println(addPatient + " - dodaj pacjenta");
            System.out.println(printPatient + " - wyświetl listę pacjentów");

            System.out.println("Wybierz opcję: ");
            option = scanner.nextInt();
            scanner.nextLine();
        }

        switch (option) {
            case addPatient:
                Patient patient = new Patient();
                System.out.println("Imię: ");
                patient.setName(scanner.nextLine());
                System.out.println("Nazwisko: ");
                patient.setLastName(scanner.nextLine());
                System.out.println("Pesel: ");
                patient.setPesel(scanner.nextLine());
                hospital.addPatient(patient);
                break;
            case printPatient:
                hospital.printPatient();
                break;
            case exit:
                System.out.println("Zamykam aplikacje");
                break;
            default:
                System.out.println("Zły numer");
        }
        scanner.close();
    }
}
