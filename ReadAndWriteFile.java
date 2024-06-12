import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        try {
            // Reading from a file
            FileReader reader = new FileReader("input.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

            System.out.println("\n\nWriting to a file...");

            // Writing to a file
            FileWriter writer = new FileWriter("output.txt");
            writer.write("This is a line of text.\n");
            writer.write("This is another line of text.");
            writer.close();

            System.out.println("File writing completed.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}