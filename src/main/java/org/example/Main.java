package org.example;

import org.example.saveToFile.SavePassword;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("**********************************************\n" +
                "*                                            *\n" +
                "*    WELCOME TO THE ULTIMATE PASSWORD        *\n" +
                "*              GENERATOR!                    *\n" +
                "*                                            *\n" +
                "*    Your fortress of security starts here.  *\n" +
                "*    Let's create passwords so strong,       *\n" +
                "*    even hackers will need a coffee break!  *\n" +
                "*                                            *\n" +
                "**********************************************\n\n");

        System.out.print("\nLet's create a password that's uniquely\n" +
                "yours. Choose what to include:\n\n" +
                "1. Small Letter (e.g., a, b, c)\n" +
                "2. Big Letter (e.g, A, B, C)\n" +
                "3. Numbers (e.g., 1, 2, 3)\n" +
                "4. Symbols (e.g., !, @, #)\n\n");

        // Get user choices
        System.out.print("Please select options (separate by commas, e.g., 1,2,3,4): ");
        String options = scanner.nextLine();

        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        Generator generator = new Generator(options, length);
        String result = generator.generatePassword();

        System.out.println("\nYour password is: " + result);

        System.out.print("Do you want to save the password? (y/n): ");
        String savePassword = scanner.nextLine().trim().toLowerCase();

        if (savePassword.equals("y")) {
            SavePassword savePasswordObject = new SavePassword();
            savePasswordObject.savePasswordToFile(result);
            System.out.println("Password saved to file!");
        } else {
            System.out.println("Password not saved.");
        }

        scanner.close();
    }
}