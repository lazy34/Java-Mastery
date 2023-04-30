package Lab_Assignment;
//Write a program to generate a random sequence of capital letters which does not include vowels

import java.util.Random;

public class program04 {
    public static void main(String[] args) {
        try {
            Random random = new Random();
            StringBuilder builder = new StringBuilder();
            int length = 10; // change this to change the length of the sequence

            for (int i = 0; i < length; i++) {
                int asciiValue;
                do {
                    asciiValue = random.nextInt(26) + 65; // generate random ASCII value between 65 and 90 (inclusive)
                } while (asciiValue == 65 || asciiValue == 69 || asciiValue == 73 || asciiValue == 79 || asciiValue == 85);
                builder.append((char) asciiValue);
            }

            String randomLetters = builder.toString();
            System.out.println("Random sequence of consonants: " + randomLetters);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Program Terminated");
        }
    }
}


// StringBuilder is a class in Java that represents a mutable sequence of characters. It is similar to the String class, but unlike strings, StringBuilder objects can be modified. This makes them useful when we need to build a string dynamically, by appending or removing characters.

// In the code I provided earlier, we use a StringBuilder object to build the final sequence of consonants. We start with an empty StringBuilder object (builder) and then append each new consonant to the end of the object using the append() method.

// The reason we use StringBuilder instead of simply concatenating strings is that concatenating strings in a loop can be inefficient, as it involves creating a new string object for each concatenation. StringBuilder avoids this problem by allowing us to modify a single object without creating new ones. This can result in better performance and reduced memory usage, especially for long sequences.

// So in summary, we are using a StringBuilder object to efficiently build a sequence of consonants one character at a time, by appending each new character to the end of the object.


