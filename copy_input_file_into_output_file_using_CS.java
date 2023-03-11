// 36.	Write a java Program to copy an input file into an output file using Character Streams.

import java.io.*;

public class copy_input_file_into_output_file_using_CS {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (Reader reader = new FileReader(inputFile);
             Writer writer = new FileWriter(outputFile)) {

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}
