package oop;
import java.util.Scanner;


public class unitt5_assignment {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("===== Administrator Menu =====");
                System.out.println("1. Add a new course");
                System.out.println("2. Enroll a student");
                System.out.println("3. Assign grade to a student");
                System.out.println("4. Calculate overall course grade for a student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter course code: ");
                        String courseCode = scanner.nextLine();
                        System.out.print("Enter course name: ");
                        String courseName = scanner.nextLine();
                        System.out.print("Enter max capacity: ");
                        int maxCapacity = scanner.nextInt();
                        CourseManagement.addCourse(courseCode, courseName, maxCapacity);
                        break;
                    case 2:
                        enrollStudent(scanner);
                        break;
                    case 3:
                        assignGrade(scanner);
                        break;
                    case 4:
                        calculateOverallGrade(scanner);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        private static void enrollStudent(Scanner scanner) {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Student student = new Student(studentName, studentId,0);

            System.out.print("Enter course code to enroll: ");
            String courseCode = scanner.nextLine();
            Course course = findCourse(courseCode);

            if (course != null) {
                CourseManagement.enrollStudent(student, course);
                System.out.println("Student enrolled successfully.");
            } else {
                System.out.println("Course not found.");
            }
        }

        private static void assignGrade(Scanner scanner) {
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Student student = findStudent(studentId);

            if (student != null) {
                System.out.print("Enter course code: ");
                String courseCode = scanner.nextLine();
                Course course = findCourse(courseCode);

                if (course != null) {
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    CourseManagement.assignGrade(student, course, grade);
                    System.out.println("Grade assigned successfully.");
                } else {
                    System.out.println("Course not found.");
                }
            } else {
                System.out.println("Student not found.");
            }
        }

        private static void calculateOverallGrade(Scanner scanner) {
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Student student = findStudent(studentId);

            if (student != null) {
                CourseManagement.calculateOverallGrade(student);
                System.out.println("Overall grade calculated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        }

        private static Course findCourse(String courseCode) {
            for (Course course : CourseManagement.getCourses()) {
                if (course.getCourseCode().equals(courseCode)) {
                    return course;
                }
            }
            return null;
        }

        private static Student findStudent(int studentId) {
            for (Student student : CourseManagement.getStudents()) {
                if (student.getId() == studentId) {
                    return student;
                }
            }
            return null;
        }
    }

