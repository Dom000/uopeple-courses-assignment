package Method_and_variables.Unit3_assignment;
import java.util.Scanner;
public class Unit3_assignment {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Student Record Manager");
                System.out.println("1. Add Student");
                System.out.println("2. Update Student");
                System.out.println("3. View Student");
                System.out.println("4. View All Students");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter grade: ");
                        String grade = scanner.nextLine();
                        StudentManager.addStudent(name, id, age, grade);
                        break;
                    case 2:
                        System.out.print("Enter ID of the student to update: ");
                        String updateId = scanner.nextLine();
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();  
                        System.out.print("Enter new grade: ");
                        String newGrade = scanner.nextLine();
                        StudentManager.updateStudent(updateId, newName, newAge, newGrade);
                        break;
                    case 3:
                        System.out.print("Enter ID of the student to view: ");
                        String viewId = scanner.nextLine();
                        StudentManager.getOneStudent(viewId);
                        break;
                    case 4:
                        StudentManager.getAllStudents();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }




