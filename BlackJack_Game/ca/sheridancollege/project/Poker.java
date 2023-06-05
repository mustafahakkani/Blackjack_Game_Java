package Poker.ca.sheridancollege.project;
import java.util.HashMap;
import java.util.Scanner;

public class Poker extends Game{
    
   
    public HashMap<String, Integer> values = new HashMap<String, Integer>();

    


    private GroupOfCards playerHand = new GroupOfCards(6){

    };
    private GroupOfCards cpuHand = new GroupOfCards(6){

    };
    private Deck deck;
    private int playerRank;
    private int cpuRank;
    private int playerBet;
    private int cpuBet;


    private String hand;
    public Poker(String name) {
        super("Poker");
        deck = new Deck();
        values.put("High Card", 1);
        values.put("Pair", 2);
        values.put("Two Pair", 3);
        values.put("Trips", 4);
        values.put("Straight", 5);
        values.put("Flush", 6);
        values.put("Full House", 7);
        values.put("Quads", 8);
        values.put("Straight flush", 9);
        values.put("Royal Flush", 10);
        makePlayerDeck();
        makeCPUDeck();
        
        
    }

    public void showCards(){
        playerHand.toString();

    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Welcome to Poker!");
        System.out.println("Your hand: ");
        System.out.println(playerHand.toString());
        
        
    }

    @Override
    public void declareWinner() {
        // TODO Auto-generated method stub
        
    }

    public void makePlayerDeck(){
        for (int i = 0; i < 5; i++) {
            playerHand.addToHand(deck.draw());
        }
    }
    
    public void makeCPUDeck(){
        for (int i = 0; i < 5; i++) {
            cpuHand.addToHand(deck.draw());
        }
    }
    
}
