// You will need to import the Random library from java.util
import java.util.Random;
import java.util.ArrayList;
import java.lang.*;

public class PuzzleJava {

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public ArrayList<Integer> getTenRolls() {
        
        // Create the Array List of numbers (integers)
        ArrayList<Integer> tenRandomNumbers = new ArrayList<Integer>();

        // Create random machine
        Random randMachine = new Random();

        // Create a for loop to add a value to the ArrayList 10 times
        // use nextInt(int bound) to return a random number between 0 (inclusive) and the value given (exclusive)
        for(int i = 0; i < 10; i++){

            // add the random number to the ArrayList
            tenRandomNumbers.add(randMachine.nextInt(20)+1);
        }
        return tenRandomNumbers;
    } 


    // Write a method that will:

        // Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
        // Generate a random index between 0-25, and use it to pull a random letter out of the array.
        // Return the random letter.

        
    public String getRandomLetter() {
        // Create random machine
        Random randMachine = new Random();

        // Create a string of the alphabet
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        // Create alphabet array (Must declare length!)
        String[] alphabetArray = new String[26];

        // Loop through the alphabet string
        for(int i = 0; i < 26; i++){

            // add each letter to the alphabet array
            alphabetArray[i] = String.valueOf(alphabetString.charAt(i));
        }

        // Get a random number between 0 and 26 to have as the index of the alphabetArray
        // The value at that index will be the random letter
        String randomLetter = alphabetArray[randMachine.nextInt(26)];
        return randomLetter;
    }


    // Write a method that uses the previous method to create a random string of eight characters, and return that string.
    public String generatePassword() {
        // Make an empty string
        String password = "";

        // Create a for loop that runs 8 times
        for(int i = 0; i < 8; i++){

            // Call the getRandomLetter function from above
            String letter = getRandomLetter();
            
            // Add the random letter to the password
            password+=letter;
        }
        return password;
    }

    // Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
    public ArrayList<String> getNewPasswordSet(int number) {

        // Create an ArrayList that will be the output
        ArrayList<String> passwordSet = new ArrayList<String>();

        // Create a for loop that will run whatever number is inputted times
        for(int i = 0; i < number; i++){

            // Call the generatePassword() method and add the output to the ArrayList
            String onePassword = generatePassword();
            passwordSet.add(onePassword);
        }
        return passwordSet;
    } 
}


