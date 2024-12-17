package oop2;

import java.util.Scanner;

public class Unit6_assignment {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose vehicle type (1. Car, 2. Motorcycle, 3. Truck): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                createCar(scanner);
                break;
            case 2:
                createMotorcycle(scanner);
                break;
            case 3:
                createTruck(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    private static void createCar(Scanner scanner) {
        System.out.println("Enter Car Make: ");
        String make = scanner.nextLine();
        System.out.println("Enter Car Model: ");
        String model = scanner.nextLine();
        System.out.println("Enter Year of Manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        Car car = new Car(make, model, year);

        System.out.println("Enter Number of Doors: ");
        int doors = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        car.setNumberOfDoors(doors);

        System.out.println("Enter Fuel Type (Petrol, Diesel, Electric): ");
        String fuelType = scanner.nextLine();
        car.setFuelType(fuelType);

        System.out.println(car);
    }

    private static void createMotorcycle(Scanner scanner) {
        System.out.println("Enter Motorcycle Make: ");
        String make = scanner.nextLine();
        System.out.println("Enter Motorcycle Model: ");
        String model = scanner.nextLine();
        System.out.println("Enter Year of Manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        Motorcycle motorcycle = new Motorcycle(make, model, year);

        System.out.println("Enter Number of Wheels: ");
        int wheels = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        motorcycle.setNumberOfWheels(wheels);

        System.out.println("Enter Motorcycle Type (Sport, Cruiser, Off-road): ");
        String type = scanner.nextLine();
        motorcycle.setMotorcycleType(type);

        System.out.println(motorcycle);
    }

    private static void createTruck(Scanner scanner) {
        System.out.println("Enter Truck Make: ");
        String make = scanner.nextLine();
        System.out.println("Enter Truck Model: ");
        String model = scanner.nextLine();
        System.out.println("Enter Year of Manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        Truck truck = new Truck(make, model, year);

        System.out.println("Enter Cargo Capacity (tons): ");
        double capacity = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        truck.setCargoCapacity(capacity);

        System.out.println("Enter Transmission Type (Manual, Automatic): ");
        String transmission = scanner.nextLine();
        truck.setTransmissionType(transmission);

        System.out.println(truck);
    }
}


