package oop;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private int grade;
    private List<Course> enrolledCourses;
    private List<Student> enrolledStudents;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade=grade;
        this.enrolledCourses = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    // Method to assign grade for a course
    public void assignGrade(Student student,  String courseId,int grade) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1) {
            student.grade=grade;
            enrolledStudents.set(index, student);

            System.out.println(enrolledStudents + "enrolled");
        } else {
            System.out.println("Student not found.");

        }
    }
}
