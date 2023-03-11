// 37.	Write a java Program to get and display files content using Reader and Writer class.


import java.io.*;
public class reader_writer_class_to_disply_files {
    public static void main(String[] args) {
        String fileName = "input.txt";
        try (Reader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
