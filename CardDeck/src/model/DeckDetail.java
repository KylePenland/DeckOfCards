package model;

import java.util.ArrayList;
import java.util.Random;

public class DeckDetail {
	//a card in the deck
    CardDetail card;
    //the deck of cards
    ArrayList<CardDetail> deck = new ArrayList<CardDetail>();    
    //the suits
    String[] suit = {"Heart","Diamond","Spade","Club"};
    //the ranking of the card
    String[] rank = {"King","Queen","Jack","Ten","Nine","Eight","Seven","Six","Five","Four",
            "Three","Two","Ace"};
    //creates a deck when called
    public DeckDetail(){
    	createDeck();
    }
    //create the deck of cards
	public void createDeck(){
		//if cards are in deck then delete all cards
		if(deck.size()>0){
			deck.clear();
		}
		//creates the deck
        for(int h=0;h<suit.length;h++){
	        for(int i=rank.length;i>0;i--){
	            card = new CardDetail(suit[h],rank[i-1]);
	            deck.add(card);
	        }
        }
    }
	public void shuffleDeck(){

       int k = deck.size();
       for(int j = 0;j<k;j++){
    	   try
    	   {
	           //generates a random number to pick a card
	           int rand = randomNumber();
	           //swaps the element at rand and element at j
	           CardDetail tempCard = deck.get(rand);
	           deck.set(rand, deck.get(j));
	           deck.set(j, tempCard);
    	   }
    	   catch(IndexOutOfBoundsException e)
    	   {
    		   System.out.println("Error shuffling deck");
    	   }
           
       }
       System.out.println("Deck Has Been Shuffled");
   }
	public int deckSize(){
		return deck.size();
	}
	public void dealCard(){
        try
        {
			//if counter reaches end of deck
	        if(deck.size() == 0){
	            //tell the user they ran out of deck
	            System.out.println("Out Of Cards");
	        }else{
		        //display the currently flipped card
		        System.out.println(deck.get(0).getRank()+" of "+ deck.get(0).getSuit());
		        //increment flip counter to get next card
		        deck.remove(0);
	        }
        }
        catch(IndexOutOfBoundsException e)
 	    {
 		   System.out.println("Error dealing a card");
 	    }
    }
	//creates a random number if there is more than one card in deck
	public int randomNumber(){
        int rand = 0;
        if(deck.size()==1){
        	
        }else{
	        Random cards = new Random();
	        rand = cards.nextInt(deck.size());
        }
        return rand;
    }
}
