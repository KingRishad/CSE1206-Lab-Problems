package employeetest;

import employeestuffs.*;
/**
 *
 * @author The one who shall not be named
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // 1. Testing valid inputs
        try {
            emp.setName("Alice");
            emp.setId(101);
            emp.setSalary(55000.0);
            System.out.println("Employee created successfully:");
            System.out.println("Name: " + emp.getName() + ", ID: " + emp.getId() + ", Salary: $" + emp.getSalary());
        } catch (InvalidIdException | InvalidNameException | InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n--- Testing Restrictions ---");

        // 2. Testing Invalid Name
        try {
            emp.setName("Bo"); // Too short
        } catch (InvalidNameException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // 3. Testing Invalid ID
        try {
            emp.setId(0); // Cannot be 0
        } catch (InvalidIdException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // 4. Testing Invalid Salary (using parameterized constructor)
        try {
            emp.setSalary(-500.0); // Cannot be negative
        } catch (InvalidSalaryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}