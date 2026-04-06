package employeestuffs;

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

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) throws InvalidNameException {
        if (name == null || name.length() < 3) {
            throw new InvalidNameException();
        }
        this.name = name;
    }

    public void setId(int id) throws InvalidIdException {
        if (id == 0) {
            throw new InvalidIdException();
        }
        this.id = id;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Error: You attempted to set a negative salary of " + salary);
        }
        this.salary = salary;
    }
}