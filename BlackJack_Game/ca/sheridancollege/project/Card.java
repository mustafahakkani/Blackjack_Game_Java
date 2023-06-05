/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package Poker.ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */


 
public class Card {
    private int cardNum;
    private Enums.COLOR color;
    private Enums.SUIT suit;
    private boolean joker;

    public Card(int cardNum, Enums.SUIT suit,Enums.COLOR color){
        this.cardNum = cardNum;
        this.color = color;
        this.suit = suit;
        this.joker = false;
        
    }

    public Card(boolean joker){
        this.joker = joker;
        this.cardNum = -1;
        this.color = null;
        this.suit = null;
    }

    public int getCardNum() {
        return this.cardNum;
    }


    public Enums.COLOR getColor() {
        return this.color;
    }


    public Enums.SUIT getSuit() {
        return this.suit;
    }

    

    @Override
    public String toString() {
        if(!joker)
        return color + ", " + cardNum + " of " + suit;
        else
        return "Joker";
    }
    

}
