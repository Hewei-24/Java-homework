import java.io.*;

public class AddLineNumbers {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Add line number every 5 lines (1, 6, 11, ...)
                if ((lineCount - 1) % 5 == 0) {
                    writer.write(lineCount + ": " + line);
                } else {
                    writer.write(line);
                }

                writer.newLine(); // Add newline after each line
            }

            System.out.println("Line numbers added successfully. Processed " + lineCount + " lines.");

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}