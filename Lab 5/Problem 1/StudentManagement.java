package studentmanagement;
import java.util.Scanner;
/**
 *
 * @author The one who shall not be named
 */
public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        System.out.println("Enter details for 5 students:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i+1) + " Name: ");
            String name = sc.nextLine();
            System.out.print("Student " + (i+1) + " ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(name, id);
        }

        System.out.print("Enter the ID to search: ");
        int searchId = sc.nextInt();

        Student result = StudentManager.searchStudentById(students, searchId);
        if(result != null){
            System.out.println("Student found: " + result.getName());
        }
        else{
            System.out.println("Student not found.");
        }
    }
}
