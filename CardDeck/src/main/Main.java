package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.DeckDetail;


public class Main {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cardFlipped = false;
		int option = 0;
		//creates a new deck
		DeckDetail deck = new DeckDetail();
		//shows option menu
		showOptions();
		Scanner scan = new Scanner(System.in);
		while(option != 4){
		try{
			//reads and sets option picked
			option = scan.nextInt();
		}catch(InputMismatchException e){
			scan.nextLine();
			option = 0;
		}
			if(option>4||option<1){
				System.out.println("Invalid Option!!! Please pick another one.");
				
			}else{
				switch(option){
				case 1:
					//clear the screen
					clearScreen();
					//cardFlipped is true
					if(cardFlipped==true){
						//then it recreates a full deck before shuffling
						deck.createDeck();
						deck.shuffleDeck();
					}else{
						//else it just shuffles the deck
						deck.shuffleDeck();}
					//shows option menu
					showOptions();
					break;
				case 2:
					//clear the screen
					clearScreen();
					//deals a card
					deck.dealCard();
					//shows option menu
					showOptions();
					//shows that a card has been flipped
					cardFlipped = true;
					break;
				case 3:
					//clear the screen
					clearScreen();
					//get size of current deck
					int z=deck.deckSize();
					//loop to deal out entire deck
					for(int y = 0; y<z;y++){
					//deals a card
					deck.dealCard();
					}
					//shows option menu
					showOptions();
					//shows that a card has been flipped
					cardFlipped = true;
					break;
				default:
					break;
				}
			}
		}
	}
	/*
	 * This method show the options for this program
	 */
	public static void showOptions(){
		System.out.println("\nDeck of Cards");
		System.out.println("-------------------");
		System.out.println("1. Shuffle Deck");
		System.out.println("2. Flip A Card");
		System.out.println("3. Show entire deck");
		System.out.println("4. Exit");
		System.out.println("-------------------");
		System.out.println("Enter option number now: ");
	}
	/*
	 * this method clears the screen
	 */
	public static void clearScreen(){
		for(int i = 0;i<30;i++){
			System.out.println("");
		}
	}
	

}
