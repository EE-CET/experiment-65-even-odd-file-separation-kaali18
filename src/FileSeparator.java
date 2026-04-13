import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSeparator {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("numbers.txt"));
            PrintWriter evenWriter = new PrintWriter(new File("even.txt"));
            PrintWriter oddWriter = new PrintWriter(new File("odd.txt"));
            
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }
            
            fileScanner.close();
            evenWriter.close();
            oddWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        System.out.print("Even File: ");
        try {
            Scanner evenReader = new Scanner(new File("even.txt"));
            while (evenReader.hasNext()) {
                System.out.print(evenReader.next() + " ");
            }
            evenReader.close();
        } catch (FileNotFoundException e) {}
        System.out.println();

        System.out.print("Odd File: ");
        try {
            Scanner oddReader = new Scanner(new File("odd.txt"));
            while (oddReader.hasNext()) {
                System.out.print(oddReader.next() + " ");
            }
            oddReader.close();
        } catch (FileNotFoundException e) {}
        System.out.println();
    }
}
