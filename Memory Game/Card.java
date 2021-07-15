public class Card
{
  private String suit;
  private String face;
  
  public Card(String s, String f)
  {
    suit = s;
    face = f;
  }
  
  public String getFace()
  {
    return face;
  }
  
  public String getSuit()
  {
    return suit;
  }
  
  public String toString()
  {
    return suit + face;
  }
}
