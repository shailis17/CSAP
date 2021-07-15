import java.util.ArrayList;

public class HotelReservation
{
  private final String[] roomNumbers;
  private Reservation [] rooms;
  private ArrayList<String> waitList;
  
  public HotelReservation()
  {
    roomNumbers = new String [] {"100A", "101A", "102A", "103A", "104A", "105A"};
    rooms = new Reservation[6];
    waitList = new ArrayList<String>();
  }
  
  public Reservation requestRoom(String name)
  {
    for(int i = 0; i < rooms.length; i++)
    {
      if(rooms[i] == null)
      {
        rooms[i] = new Reservation(name, roomNumbers[i]);
        return rooms[i];
      }
    }
    waitList.add(name);
    return null;
  }
  
  public Reservation cancelReassign (String name)
  {
    for(int i = 0; i < rooms.length; i++)
    {
      if(rooms[i] == null)
        continue;
      if(rooms[i].getName().equals(name))
      {
        if(waitList.isEmpty() == false)
        {
          rooms[i] = new Reservation(waitList.get(0), rooms[i].getRoomNumber());
          waitList.remove(0);
          return rooms[i];
        }
        else
        {
        rooms[i] = null;
        return null;
        }
      }
    }
    return null;
  }
  
  public String toString ()
  {
    String rmNums = "| ";

    for(int i = 0; i < roomNumbers.length; i++)
    {
      rmNums += roomNumbers[i] + " | ";
    }
    String rms = "| ";
    
    for(int i = 0; i < rooms.length; i++)
    {
      rms += rooms[i] + " | ";
    }
    String wl = "| ";
    
    for(int i = 0; i < waitList.size(); i++)
    {
      wl += waitList.get(i) + " | ";
    }
    
    return "Room Numbers: " + rmNums + "\nRooms: " + rms + "\nWaitlist: " + wl + "\n";
  }
}
