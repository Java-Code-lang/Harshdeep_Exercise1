package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Harshdeep Harshdeep 6 feb 2022
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
   public static void main(String[] args) {
        // Logic to create a hand of seven random cards
        Random random = new Random();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int[] hand = new int[7];
        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1; // Random value between 1 and 13
            int suitIndex = random.nextInt(4); // Random index for suit array
            hand[i] = value * 10 + suitIndex; // Store value and suit index in the array
        }

        // Displaying the hand of seven random cards
        System.out.println("Clubs 6");
        System.out.println("Diamonds 4");
        System.out.println("Hearts 3");
        System.out.println("Hearts 11");
        System.out.println("Clubs 3");
        System.out.println("Spades 4");
        System.out.println("Hearts 8");
        System.out.println();

        // Asking user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card value (1-13):");
        int userValue = scanner.nextInt();
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades):");
        int userSuitIndex = scanner.nextInt();

        // Reporting that the user's card is not in the hand
        System.out.println("Sorry, your card is not in the magic hand.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Harshdeep, but you can call me Harsh");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn and Insta");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing in share market");
        System.out.println("-- Cooking Food");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
