package org.example.saveToFile;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SavePassword {

    public SavePassword() {}

    public void savePasswordToFile(String password) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("[dd/MM/yyyy HH:mm:ss]    ");

        try (FileWriter writer = new FileWriter("password.txt", true)) {
            writer.write( formatter.format(date) + "Generated Password: " + password+ "\n");
            System.out.println("Password saved to 'password.txt'.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the password to the file.");
            e.printStackTrace();
        }
    }
}
