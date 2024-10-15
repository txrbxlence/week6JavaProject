package gameOfWar;

import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {
    
    
   // Card card = new Card(2, "2 of Hearts");
   // card.describe();
    
    Deck deck = new Deck();
    List<Card> hand1 = new ArrayList<>();
    List<Card> hand2 = new ArrayList<>();
    Player player1 = new Player(hand1, 0, "Omari");
    Player player2 = new Player(hand2, 0, "Cairo");
    
    
    System.out.println("----GAME OF WAR----\n\n\n\nGAME START:\n\n\n\nPLAYER 1: " + player1.getName() + "\nPLAYER 2: " + player2.getName() + "\n\n\n\n");
    
    player1.describe();
    System.out.println("\n");
    player2.describe();
    
    deck.shuffle();
    
    for(int i = 0; i < 52; i++) {
      if(i % 2 == 0) {
        player1.draw(deck);
      }else {
        player2.draw(deck);
      }
    }
 

    
    
    for(int j = 0; j < 26; j++) {
      if(player1.getHand().get(0).getValue()
         > player2.getHand().get(0).getValue() ){
        player1.incrementScore();
        System.out.println("\n\n\nRound " + (j + 1) + " of 26: " + player1.getName() + " scored a point!");
        
      }else if(player1.getHand().get(0).getValue() 
               == player2.getHand().get(0).getValue() ) {
        System.out.println("\n\n\nRound " + (j + 1) + " of 26: " + "It's a tie! No points awarded.");
        
      }else if(player1.getHand().get(0).getValue()
               < player2.getHand().get(0).getValue() ){ 
        player2.incrementScore();
        System.out.println("\n\n\nRound " + (j + 1) + " of 26: " + player2.getName() + " scored a point!");
      }
      
      System.out.print(player1.getName() + " drew the: "); player1.flip().describe();
      System.out.print(player2.getName() + " drew the: "); player2.flip().describe(); 
      System.out.println("\n");
      player1.describe();
      System.out.println("\n");
      player2.describe();
    }
    
    
    System.out.println("\n" + player1.getName() + "'s final score: " + player1.getScore() );
    System.out.println(player2.getName() + "'s final score: " + player2.getScore() );

    
    if(player1.getScore() > player2.getScore() ) {
      System.out.println("\n\nWinner: " + player1.getName() );
      
    }else if(player1.getScore() < player2.getScore() ) {
      System.out.println("\n\nWinner: " + player2.getName() );
      
    }else {
      System.out.println("\n\nDraw");
    }
    
  }

}
