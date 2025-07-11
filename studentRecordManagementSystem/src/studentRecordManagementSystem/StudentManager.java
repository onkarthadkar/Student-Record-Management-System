package studentRecordManagementSystem;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void updateStudent(int id, String name, double marks) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setMarks(marks);
                System.out.println("Student updated: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student with ID " + id + " deleted.");
    }
}
