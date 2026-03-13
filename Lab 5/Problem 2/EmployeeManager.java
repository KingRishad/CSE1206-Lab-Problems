package employeemanagement;

/**
 *
 * @author The one who shall not be named
 */
public class EmployeeManager {
    public static int[] filterEmployeeBySalary(Employee[] employees, double salary){
        int count = 0;
        for (Employee emp : employees) {
            if (emp.getSalary() > salary) {
            count++;
            }
        }
        
        if(count == 0){
            return new int[0];
        }
        
        int[] result = new int[count];
        int index = 0;
        for (Employee emp : employees) {
            if (emp.getSalary() > salary) {
                result[index] = emp.getId();
                index++;
            }
        }
        return result;
    }
}
