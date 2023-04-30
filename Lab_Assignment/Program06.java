package Lab_Assignment;
//Write a program to calculate permutation, Combination of two numbers

import java.util.Scanner;

class MathOperations {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

class Permutations extends MathOperations {
    public int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
}

class Combinations extends MathOperations {
    public int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}

public class Program06 {

    public static void main(String[] args){
        try{
            Permutations p = new Permutations();
            Combinations c = new Combinations();

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = input.nextInt();
            System.out.println("Enter the value of r");
            int r = input.nextInt();

            System.out.println("Permutation of " + n + " and " + r + ": " + p.permutation(n, r));
            System.out.println("Combination of " + n + " and " + r + ": " + c.combination(n, r));
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred:"+e);
        }



    }
}


