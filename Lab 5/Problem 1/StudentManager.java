package studentmanagement;

/**
 *
 * @author The one who shall not be named
 */
public class StudentManager {
    public static Student searchStudentById(Student[] students, int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
