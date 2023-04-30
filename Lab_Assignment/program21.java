package Lab_Assignment;

//Write a program to print the duplicate elements present in an array and then remove duplicate elements

import java.util.Arrays;
import java.util.Scanner;

public class program21{
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the array elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }

            // Find and print duplicate elements
            boolean[] found = new boolean[arr.length];
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        found[j] = true;
                    }
                }
            }
            System.out.print("Duplicate elements: ");
            for (int i = 0; i < found.length; i++) {
                if (found[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();

            // Remove duplicate elements
            int uniqueCount = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!found[i]) {
                    uniqueCount++;
                }
            }
            int[] unique = new int[uniqueCount];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!found[i]) {
                    unique[index] = arr[i];
                    index++;
                }
            }

            // Print array with duplicate elements removed
            System.out.println("Array with duplicate elements removed: " + Arrays.toString(unique));
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred :"+e);
        }
        finally {
            System.out.println("Program terminated");
        }
    }
}

