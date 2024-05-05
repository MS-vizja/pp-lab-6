import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        lic static void main(String[] args) {
            Worker worker1 = new Worker("John", 5500, 1, "19-02-2023", "Malarz");
            Worker worker2 = new Worker("Andrzej", 4000, 2, "27-02-2023", "Stolarz");
            Worker worker3 = new Worker("Tomek", 3500, 3, "15-04-2023", "Tynkarz");
            Worker worker4 = new Worker("Krzychu", 4900, 4, "25-05-2023", "Akrobata");
            Worker worker5 = new Worker("Jakub", 4700, 3, "23-08-2023", "Magazynier"); 
            Worker worker6 = new Worker("Zuzanna", 3100, 6, "12-07-2022", "Sprzataczka");
            Manager manager1 = new Manager("Jacek", 7000, 5, "11-03-2022", "Manager");
            Manager manager2 = new Manager("Filip", 8500, 5, "09-08-2023", "Design Manager"); 
            Manager manager3 = new Manager("Pawel", 9000, 5, "29-09-2020", " Warehouse Manager"); 

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        Map<Integer, List<String>> idMap = new HashMap<>();

        for (Employee employee : employees) {
           
            totalSalary += employee.getSalary();

            
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }

           
            idMap.computeIfAbsent(employee.getId(), k -> new ArrayList<>()).add(employee.getName());
        }

        
        System.out.println("Laczna wyplata: " + totalSalary);
        System.out.println("Laczna wyplata menadzerow: " + totalManagerSalary);
        System.out.println("Laczna wyplata pracownikow: " + totalWorkerSalary);

        
        System.out.println("zdublowane ID:");
        idMap.forEach((id, names) -> {
            if (names.size() > 1) {
                System.out.println("ID " + id + " pojawia sie dla: " + names);
            }
        });
    }
}
