// 35.	Write a java program to copy an input file into an output file using byte streams.


import java.io.*;
public class copy_input_file_into_output_file_using_BS {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (InputStream inputStream = new FileInputStream(inputFile);
             OutputStream outputStream = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}
