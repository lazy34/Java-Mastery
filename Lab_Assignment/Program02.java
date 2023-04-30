package Lab_Assignment;
//Write a program with all possible cases to find a number (let number is 47) is prime or not. Also,
//        print how many iterations are needed for all possible cases

class Program02
{
    public static void main(String[] args)
    {
        try {
            int num = 47;
            int iteration = 0;
            boolean isPrime = true;

            // 1st approch
            for (int i = 1; i <= num; i++) {
                iteration++;
                if (num % i == 0 && i != num && i != 1) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.println(num + " is prime.");
            } else {
                System.out.println(num + " is not prime.");
            }
            System.out.print("For 1 to N ");
            System.out.println("number of iteration is " + iteration);


            // 2nd approch
            iteration = 0;
            for (int i = 2; i < num; i++) {
                iteration++;
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
//        if (isPrime && num > 1) {
//            System.out.println(num + " is prime.");
//        } else {
//            System.out.println(num + " is not prime.");
//        }
            System.out.print("For 2 to N-1 ");
            System.out.println("number of iteration is " + iteration);


            // 3rd approch
            iteration = 0;
            for (int i = 2; i <= num / 2; i++) {
                iteration++;
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
//        if (isPrime && num > 1) {
//            System.out.println(num + " is prime.");
//        } else {
//            System.out.println(num + " is not prime.");
//        }
            System.out.print("For 2 to N/2 ");
            System.out.println("number of iteration is " + iteration);


            // 4rth approch
            iteration = 0;
            for (int i = 2; i * i <= num; i++) {
                iteration++;
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

//        if(isPrime && num>1)
//        {
//            System.out.println(+num+" is a prime Number");
//        }
//        else
//        {
//            System.out.println(+num+" is not a prime Number");
//        }
            System.out.print("For 2 to Square root of N ");
            System.out.println("number of iteration is " + iteration);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}