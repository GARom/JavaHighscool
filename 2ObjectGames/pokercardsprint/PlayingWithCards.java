/* Challenge Activity 1 - Playing with Cards
 * 
Write a program which uses the Card class in the pokercards package and the 
Random class in java.util in order to:

1) Create the queen of hearts card
2) Create a random card (one of the 52 possible cards)
3) print out both cards and whether they are the same suit.
 
 */
package pokercardsprint;

import java.util.Random;
import pokercards.Card;
import pokercards.Ranks;
import pokercards.Suits;

public class PlayingWithCards {

    public static void main(String[] args) {
        // TODO: write code here
        Random gen = new Random();
        Card queenOfHearts = new Card(Ranks.QUEEN, Suits.HEARTS);
        Card randomCard = new Card(gen.nextInt(52));
        System.out.printf("%s %s Same Suit? %s\n", queenOfHearts, randomCard, randomCard.sameSuit(queenOfHearts));             
    }
}
