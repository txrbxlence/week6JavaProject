package gameOfWar;

public class Card {
  
  private int value;
  private String name;
  
  public Card(int value, String name) {
    setValue(value);
    setName(name);
    
  }
  
  public void describe() {
    System.out.println(name + " -- " + value);
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  

}
