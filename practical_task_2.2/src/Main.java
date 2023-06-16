
import java.util.Scanner;  // Import the Scanner class

public class Main {
    static void printHelloName() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = scanner.nextLine();  // Read user input
        System.out.println("Hello, " + userName);  // Output user input

    }
    static void printHelloWorld() {
        System.out.println("Hello world!");
    }
    public static void main(String[] args) {
        printHelloWorld();
        printHelloName();
    }
}