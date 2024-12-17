package Collection_api_java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Unit8_assignment {


    static class Employee {
        private String name;
        private String department;
        private double salary;
        private int age;

        // Constructor, getters, and setters
        public Employee(String name, String department, double salary, int age) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }
    }


        public static void main(String[] args) {
            // Step 1: Read and store dataset in a collection
            List<Employee> employees = Arrays.asList(
                    new Employee("John Doe", "Finance", 70000, 35),
                    new Employee("Jane Smith", "HR", 60000, 29),
                    new Employee("Mike Johnson", "IT", 95000, 40),
                    new Employee("Emily Davis", "Marketing", 75000, 33)
            );

            // Step 2: Function to concatenate employee name and department
            Function<Employee, String> nameAndDept = emp -> emp.getName() + " (" + emp.getDepartment() + ")";

            // Step 3: Generate a new collection with concatenated strings
            List<String> nameAndDeptList = employees.stream()
                    .map(nameAndDept)
                    .collect(Collectors.toList());

            // Output concatenated name and department
            System.out.println("Employees with their departments:");
            nameAndDeptList.forEach(System.out::println);

            // Step 4: Calculate the average salary of all employees
            double averageSalary = employees.stream()
                    .mapToDouble(Employee::getSalary)
                    .average()
                    .orElse(0.0);

            System.out.println("Average Salary: " + averageSalary);

            // Step 5: Filter employees whose age is above 30
            List<Employee> filteredEmployees = employees.stream()
                    .filter(emp -> emp.getAge() > 30)
                    .collect(Collectors.toList());

            System.out.println("Employees above the age of 30:");
            filteredEmployees.forEach(emp -> System.out.println(emp.getName() + ", Age: " + emp.getAge()));

            // Bonus: Find the highest salary among employees
            double maxSalary = employees.stream()
                    .mapToDouble(Employee::getSalary)
                    .max()
                    .orElse(0.0);

            System.out.println("Highest Salary: " + maxSalary);
        }
    }


