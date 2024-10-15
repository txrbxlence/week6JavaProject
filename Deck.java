package gameOfWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  
  private List<Card> deck = new ArrayList<>();
  
  public Deck() {
    int[] values= {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};

    
    for(String suit : suits){
      int index = 0;
      for(String name : names) {
        StringBuilder nameOfCard = new StringBuilder();
        nameOfCard.append(name + " of " + suit);
        Card card = new Card(values[index], nameOfCard.toString() );
        deck.add(card);
        index++;
      }
    }
  }
  
  public void shuffle() {
    Collections.shuffle(deck);
  }
  
  public Card draw() {
    if(deck.isEmpty() ) {
      return null;
    }
      return deck.remove(0);
  }


  public List<Card> getDeck() {
    return deck;
  }

  public void setDeck(List<Card> deck) {
    this.deck = deck;
  }
  
  public void describe() {
    for(Card card : deck) {
      card.describe();
    }
  }
  
  
   

}
