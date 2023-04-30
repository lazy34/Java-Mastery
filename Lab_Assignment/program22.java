package Lab_Assignment;
//Write a program to find frequency of characters in a string


public class program22 {
    public static void main(String[] args) {
        try {
            String str = "Hello World!";
            int[] frequencyArray = new int[256];

            // Count frequency of each character in string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                frequencyArray[ch]++;
            }

            // Print frequency of each character
            for (int i = 0; i < 256; i++) {
                if (frequencyArray[i] > 0) {
                    System.out.println("'" + (char) i + "' occurs " + frequencyArray[i] + " times");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error Occurred :"+e);
        }

        finally
        {
            System.out.println("Program Terminated");
        }
    }
}
