package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileProcessor {

    public static void processFile(String filePath) {
        FileReader reader = null;
        try {
            reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process the line
                System.out.println(line);  // Example processing: print the line
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Provide the path to your file here
        String filePath = "example.txt";
        processFile(filePath);
    }
}
