
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 5500, 1, "19-02-2023", "Malarz");
        Worker worker2 = new Worker("Andrzej", 4000, 2, "27-02-2023", "Stolarz");
        Worker worker3 = new Worker("Tomek", 3500, 3, "15-04-2023", "Tynkarz");
        Worker worker4 = new Worker("Krzychu", 4900, 4, "25-05-2023", "Akrobata");
        Manager manager = new Manager("Grzesiek", 7000, 5, "11-03-2022", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work(); 
            System.out.println("- " + employee.getName() +
                " (ID: " + employee.getId() + 
                ", Stanowisko: " + employee.getPosition() + 
                ", Data zatrudnienia: " + employee.getHireDate() + 
                ", Wyplata: " + employee.getSalary() + ").");
        }
    }
}
