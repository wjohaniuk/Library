package zadania.pl.employee;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[80];
        employees[0] = new Employee("Jan", "Nowak", 2500);
        employees[1] = new Employee("Janina", "Tomaszewicz", 2300);
        employees[2] = new Employee("Karol", "Nowacki", 6500);

        int employeeIndex = 1;
        if (employeeIndex >= 0 && employeeIndex < employees.length) {
            System.out.println(employees[employeeIndex].getFirstName() + " " + employees[employeeIndex].getLastName()
                    + " " + employees[employeeIndex].getSalary());
        }
        System.out.println("Rozmiar ablicy: " + employees.length);
    }
}
