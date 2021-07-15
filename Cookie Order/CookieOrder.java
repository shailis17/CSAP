public class CookieOrder
{
  private String cookieVariety;
  private int boxes;
  
  public CookieOrder (String variety, int numBoxes)
  {
    cookieVariety = variety;
    boxes = numBoxes;
  }
  
  public String getVariety()
  {
    return cookieVariety;
  }
  
  public int getNumBoxes()
  {
    return boxes;
  }
  
  public String toString()
  {
    return cookieVariety + " " + boxes;
  }
}
