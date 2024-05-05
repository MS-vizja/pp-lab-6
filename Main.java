import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 5500, 1, "19-02-2023", "Malarz");
        Worker worker2 = new Worker("Andrzej", 4000, 2, "27-02-2023", "Stolarz");
        Worker worker3 = new Worker("Tomek", 3500, 3, "15-04-2023", "Tynkarz");
        Worker worker4 = new Worker("Krzychu", 4900, 4, "25-05-2023", "Akrobata");
        Manager manager = new Manager("Grzesiek", 7000, 5, "11-03-2022", "Manager");

        Employee[] employees = {worker1, worker2, worker3, worker4, manager}; 

        
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        
        System.out.println("Test id " + worker2.getName() + " z innymi pracownikami:");
        for (Employee employee : employees) {
            boolean isEqual = worker2.equals(employee);
            System.out.println(worker2.getName() + " takie samo jak " + employee.getName() + ": " + isEqual);
        }
    }
}
