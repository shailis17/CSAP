import java.util.*;

public class MasterOrder
{
  private ArrayList<CookieOrder> orders;
  
  public MasterOrder()
  {
    orders = new ArrayList<CookieOrder>();
  }
  
  public void addOrder (CookieOrder theOrder)
  {
    orders.add(theOrder);
  }
  
  public int getTotalBoxes()
  {
    if(orders.isEmpty() == true)
      return 0;
    
    int total = 0;
    for(int i = 0; i < orders.size(); i++)
    {
      total += orders.get(i).getNumBoxes();
    }
    return total;
  }
  
  public int removeVariety(String cookieVar)
  {
    if(orders.isEmpty())
      return 0;
    
    int removed = 0;
    for(int i = 0; i < orders.size(); i++)
    {
      if(orders.get(i).getVariety() == cookieVar)
      removed += orders.get(i).getNumBoxes();
    }
    return removed;
  }
  
  public String toString()
  {
    String theOrders = "[ ";
    
    for(int i = 0; i < orders.size(); i++)
    {
      theOrders += orders.get(i).toString();
      theOrders += ", ";
    }
    
    theOrders += "]";
    return theOrders;
  }
}
