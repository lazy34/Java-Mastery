package Lab_Assignment;
//import Lab_Assignment.QuickSort;
import java.util.Scanner;

interface Search {
    public int search(int[] arr, int x);
}
//Program 08
class LinearSearch implements Search {
    public int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

//Program 07
class BinarySearch implements Search {
    public int search(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class Searching {

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the array elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("Enter the Searching Element");
            int x = input.nextInt();

            Search linearSearch = new LinearSearch();
            int linearIndex = linearSearch.search(arr, x);
            if (linearIndex == -1) {
                System.out.println("Linear Search: Element not found.");
            } else {
                System.out.println("Linear Search: Element found at index " + linearIndex);
            }

            Search binarySearch = new BinarySearch();
            QuickSort QS = new QuickSort();
            QS.sort(arr);
            int binaryIndex = binarySearch.search(arr, x);
            if (binaryIndex == -1) {
                System.out.println("Binary Search: Element not found.");
            } else {
                System.out.println("Binary Search: Element found at index " + binaryIndex);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred : "+e);
        }
        finally {
            System.out.println("Program Terminated");
        }
    }
}
