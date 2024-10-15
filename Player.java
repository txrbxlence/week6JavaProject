package gameOfWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
  
  private List<Card> hand = new ArrayList<>();
  private int score;
  private String name;
  
  public Player(List<Card> hand, int score, String name){
    score = 0;
    setHand(hand);
    setScore(score);
    setName(name);  
    
    
      
    
  }
  
  public void describe() {
    System.out.println(name + "'s current score: " + score);
    StringBuilder box = new StringBuilder();
    for(int i = 0; i < 40; i++) {
      box.append("-");
    }
    if(hand.isEmpty()) {
      System.out.println(box.toString() + "\n" + name + " has zero cards..\n" + box.toString());
    }else {
      System.out.println(box.toString() );
      for(Card card : hand) {
        card.describe();
      }
      System.out.println(box.toString() );
    }
  }
  
  public Card flip() {
    if(!hand.isEmpty() ) {
      return hand.remove(0);
    }else {
      return null;
    }
    
  }
  
  public void draw(Deck deck) {
    hand.add(deck.draw() );
  }
  
  public void incrementScore() {
    score += 1;
  }

  public List<Card> getHand() {
    return hand;
  }

  public void setHand(List<Card> hand) {
    this.hand = hand;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
