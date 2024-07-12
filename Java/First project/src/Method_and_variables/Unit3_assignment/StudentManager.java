package Method_and_variables.Unit3_assignment;

import java.util.ArrayList;

public class StudentManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int totalStudents = 0;
    private static ArrayList<String> uniqueStudentsIds = new ArrayList<>();

    public static void addStudent(String name, String id, int age, String grade) {
        if(uniqueStudentsIds.contains(id)){
            System.out.println("Student with id " + id + " already exists");
        }else {
            students.add(new Student(name, id, age, grade));
            uniqueStudentsIds.add(id);
        }
        totalStudents++;
    }

    public static void updateStudent(String id, String name, int age, String grade) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setAge(age);
                student.setGrade(grade);
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    public static void getOneStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    public static void getAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}

