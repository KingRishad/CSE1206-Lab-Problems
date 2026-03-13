package employeemanagement;

/**
 *
 * @author The one who shall not be named
 */
public class Employee {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id) {
        this.id = id;
    }
    
}
