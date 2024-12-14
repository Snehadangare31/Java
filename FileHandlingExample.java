import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Create and write to a file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("File handling includes reading, writing, and deleting files.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred during writing: " + e.getMessage());
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred during reading: " + e.getMessage());
        }

        // Delete the file
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.err.println("Failed to delete the file.");
        }
    }
}


        

        