package Lab_Assignment;
//Write a program to find sum of Even numbers present in the first 100 numbers of Fibonacci Series

public class program05 {
    public static void main(String[] args) {
        try {
            int n = 100; // number of Fibonacci terms to generate
            int sum = 0; // initialize the sum of even terms to zero
            int first = 0; // first term of Fibonacci series
            int second = 1; // second term of Fibonacci series

            for (int i = 1; i <= n; i++) {
                int current = first + second;
                if (current % 2 == 0) {
                    sum += current; // add the even term to the sum
                }
                first = second;
                second = current;
            }

            System.out.println("Sum of even terms in the first " + n + " Fibonacci numbers: " + sum);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Program Terminated");
        }
        //
    }
}

