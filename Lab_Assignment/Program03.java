package Lab_Assignment;
//Write a program to print Alternate Prime numbers up to 60


public class  Program03 {
    public static void main(String[] args) {
        try {
            int range = 60;
            int count = 0;
            for (int i = 2; i <= range; i++) {
                if (isPrime(i)) {
                    if (count % 2 == 0) {
                        System.out.print(i + " ");
                    }
                    count++;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("\nProgram Terminated");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
