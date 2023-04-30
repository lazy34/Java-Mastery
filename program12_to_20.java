package Lab_Assignment;
import java.util.*;
import Lab_Assignment.MathOperations;


public class program12_to_20 {
    // Automorphic Number Function
    //Program 12
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String squareStr = Integer.toString(square);
        String nStr = Integer.toString(n);
        return squareStr.endsWith(nStr);
    }

    // Peterson Number Function
    //program 13
    public static boolean isPeterson(int n) {
        int sum = 0;
        int num = n;
        while (num != 0) {
            int digit = num % 10;
            sum += MathOperations.factorial(digit);
            num /= 10;
        }
        return sum == n;
    }

    //Armstrong Number Function
//    Program 14
    public static boolean isArmstrong(int n) {
        int num = n;
        int sum = 0;
        int digits = countDigits(n);
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == n;
    }

    //Count digit Function
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    //Sunny Number Function
    //Program 15
    public static boolean isSunny(int n)
    {
        double root;
        root=Math.sqrt(n+1);
        return ((int)root==root);
    }
    
    //Neon Number Function
    //Program 16
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
    //Spy Number Function
    //Program 17
    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    //Evil Number Function
    //Program 18
    public static boolean isEvil(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count % 2 == 0;
    }

    //ISBN number Function
    //Program 19
    public static boolean isValidISBN(int isbn) {
        // Check that the ISBN has exactly 10 digits
        int count = 0;
        int temp = Math.abs(isbn);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        if (count != 10) {
            return false;
        }

        // Calculate the sum of the products of each digit and its weight
        int sum = 0;
        for (int i = 10; i >= 1; i--) {
            int digit = isbn % 10;
            sum += digit * i;
            isbn /= 10;
        }

        // The ISBN is valid if the sum is divisible by 11
        return (sum % 11 == 0);
    }


    //Bouncy Number Function
    //Program 20
    public static boolean isBouncyNumber(int n) {
        // Convert the number to a string
        String str = Integer.toString(n);

        // Check if the number is increasing or decreasing
        boolean increasing = false;
        boolean decreasing = false;
        char prev = str.charAt(0);
        for (char c : str.toCharArray()) {
            if (c < prev) {
                decreasing = true;
            } else if (c > prev) {
                increasing = true;
            }
            prev = c;
        }

        // Check if the number is bouncy
        return (increasing && decreasing);
    }



    public static void main(String []args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Number");
            int num = input.nextInt();
            while (true) {
                System.out.println("1.Automorphic Number\n2.Peterson Number\n3.Armstrong Number\n4.Sunny Number" +
                        "\n5.Neon Number\n6.Spy Number\n7.Evil Number\n8.ISBN number\n9.Bouncy Number\n0.Exit\nEnter Your Choice");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        boolean result = isAutomorphic(num);
                        System.out.println("Is it Automorphic Number?:" + result);
                        break;

                    case 2:
                        result = isPeterson(num);
                        System.out.println("Is it Peterson Number?:" + result);
                        break;

                    case 3:
                        result = isArmstrong(num);
                        System.out.println("Is it Armstrong Number?:" + result);
                        break;

                    case 4:
                        result = isSunny(num);
                        System.out.println("Is it Sunny Number?:" + result);
                        break;

                    case 5:
                        result = isNeon(num);
                        System.out.println("Is it Neon Number?:" + result);
                        break;

                    case 6:
                        result = isSpy(num);
                        System.out.println("Is it Spy Number?:" + result);
                        break;

                    case 7:
                        result = isEvil(num);
                        System.out.println("Is it Evil Number?:" + result);
                        break;

                    case 8:
                        result = isValidISBN(num);
                        System.out.println("Is it ISBN Number?:" + result);
                        break;

                    case 9:
                        result = isBouncyNumber(num);
                        System.out.println("Is it Bouncy Number?:" + result);
                        break;

                    case 0:
                        System.out.println("Program Terminated");
                        System.exit(0);


                    default:
                        System.out.println("Invalid Input");
                }

                System.out.println("Continue??\n1.yes\n0.no");
                System.out.println("Enter Your Choice");
                int ch = input.nextInt();
                switch (ch) {
                    case 1:
                        continue;
                    case 0:
                        System.out.println("Program Terminated");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Input");
                }

            }
        }
        catch (Exception e)
        {
            System.out.println("Error Occurred :"+e);
        }
        finally {
            System.out.println("Program terminated");
        }
    }
    
}





