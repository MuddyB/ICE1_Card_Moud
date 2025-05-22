/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Mouddassar Baig
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
           
        }
        
        Scanner input = new Scanner(System.in);
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter a card value (1-13: ");
        int uValue = input.nextInt();
        System.out.println("Enter a suit 0-3 where 0 = hearts, 1=diamonds, 2=clubs, 3=spades): ");
        int suitIndex = input.nextInt();
        String uSuit = Card.SUITS[suitIndex];
        Card uCard = new Card();
        uCard.setValue(uValue);
        uCard.setSuit(uSuit);
        
        // and search magicHand here
        boolean found = false;
        for (int i=0; i<magicHand.length; i++) {
            if (magicHand[i].getValue() == uCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(uSuit))
            {
                found = true;
                break;
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("Congrats! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is NOT in the magic hand");
        }
        // add one luckcard hard code 2,clubs
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit("clubs");
        magicHand[7] = luckCard;

        
    }
    
}
