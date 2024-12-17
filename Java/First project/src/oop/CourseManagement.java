package oop;

import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    private static List<Course> courses = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();


    public static List<Course> getCourses() {
        return courses;
    }

    public static List<Student> getStudents() {
        return students;
    }

    // Method to add a new course
    public static void addCourse(String courseCode, String name, int maxCapacity) {
        Course newCourse = new Course(courseCode, name, maxCapacity);
        courses.add(newCourse);
    }

    // Method to enroll a student in a course
    public static void enrollStudent(Student student, Course course) {
        student.enrollCourse(course);
        course.enrollStudent();
        students.add(student);
    }

    // Method to assign grade to a student for a course
    public static void assignGrade(Student student, Course course, int grade) {
        student.assignGrade(student,course.getCourseCode(), grade);
    }

    // Method to calculate overall course grade for a student
    public static void calculateOverallGrade(Student student) {

    }
}
