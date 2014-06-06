package model;

public class CardDetail {
	//strings hold the suit and rank of a card
    String suit;
    String rank;
    //base constructor
    public CardDetail(){
        suit = "heart";
        rank = "ace";
    }
    //overloaded to accept suit and rank
    public CardDetail(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    /*
    getter and setter for suit
     */
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    /*
    getter and setter for rank
     */
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
