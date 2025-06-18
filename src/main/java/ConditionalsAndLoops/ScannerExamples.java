package ConditionalsAndLoops;

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. String input (one word)
        System.out.print("Enter your name: ");
        String name = scanner.next(); // Stops at space
        System.out.println("Name: " + name);

        // 2. String input (full line)
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter your full address: ");
        String address = scanner.nextLine();
        System.out.println("Address: " + address);

        // 3. Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age);

        // 4. Float input
        System.out.print("Enter your height (in meters): ");
        float height = scanner.nextFloat();
        System.out.println("Height: " + height);

        // 5. Double input
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("GPA: " + gpa);

        // 6. Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student? " + isStudent);

        // 7. Char input
        System.out.print("Enter a grade (A/B/C): ");
        char grade = scanner.next().charAt(0); // No direct method for char
        System.out.println("Grade: " + grade);

        // 8. Reading comma-separated values
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter three comma-separated values: ");
        String[] values = scanner.nextLine().split(",");
        for (String v : values) {
            System.out.println("Value: " + v.trim());
        }

        // 9. Reading multiple integers in a single line
        System.out.print("Enter 3 integers (space-separated): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Sum: " + (a + b + c));

        scanner.close();
    }
}
