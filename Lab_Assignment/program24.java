package Lab_Assignment;
//Write a program, which will read a string and rewrite it in the alphabetical order. Like, “TABLE”
//        should be written as “ABELT”

import java.util.Arrays;
import java.util.Scanner;

public class program24 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sortedStr = new String(charArray);
            System.out.println("Sorted string: " + sortedStr);
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred :"+e);
        }
        finally {
            System.out.println("Program Terminated");
        }
    }
}

