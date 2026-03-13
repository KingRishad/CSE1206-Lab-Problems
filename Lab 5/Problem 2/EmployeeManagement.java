package employeemanagement;
import java.util.Scanner;
/**
 *
 * @author The one who shall not be named
 */
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int arraySize = sc.nextInt();
        sc.nextLine();
        
        Employee[] employees = new Employee[arraySize];
        
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(name, id, salary);
        }
        
        System.out.print("Enter a salary threshold: ");
        double salary = sc.nextDouble();
        
        int[] EmployeeIDs = EmployeeManager.filterEmployeeBySalary(employees, salary);

        if (EmployeeIDs.length == 0) {
            System.out.println("No employees found with salary higher than " + salary + ".");
        }
        else {
            System.out.print("Employees with salary higher than " + salary + ": ");
            for (int id : EmployeeIDs) {
                System.out.print(id + " ");
            }
        }

        
        sc.close();
    }
}
