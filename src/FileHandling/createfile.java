package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class createfile {
    public static void main(String[] args) {

        try {
            // 1. Create File
            File file = new File("Student.txt");

            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

            // 2. Write to File
            FileWriter writer = new FileWriter(file);
            writer.write("Hello Java File Handling\n");
            writer.write("This is first line.");
            writer.close();
            System.out.println("Data Written Successfully");

            // 3. Read File
            System.out.println("\nReading File:");
            FileReader reader = new FileReader(file);

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

            // 4. Append Data
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nThis line is appended.");
            appendWriter.close();
            System.out.println("\n\nData Appended Successfully");

            // 5. File Information
            System.out.println("\nFile Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("Can Read: " + file.canRead());
            System.out.println("Can Write: " + file.canWrite());
            System.out.println("File Size: " + file.length() + " bytes");

            // 6. Rename File
            File newFile = new File("newData.txt");
            if (file.renameTo(newFile)) {
                System.out.println("File Renamed Successfully");
            } else {
                System.out.println("Rename Failed");
            }

            // 7. Delete File
            if (newFile.delete()) {
                System.out.println("File Deleted Successfully");
            } else {
                System.out.println("Delete Failed");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}