package Lab_Assignment;
//Write a program to extract a portion of a character string and print the extracted string. Assume that
//m characters are extracted, starting with nth character

public class program23 {
    public static void main(String[] args) {
        try {
            String str = "Hello World!";
            int n = 6; // starting index
            int m = 5; // number of characters to extract

            String extracted = str.substring(n, n + m);
            System.out.println(extracted);
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred :"+e);
        }
    }
}

