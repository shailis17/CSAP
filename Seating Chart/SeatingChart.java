import java.util.List;

public class SeatingChart
{
  private Student [][] seats;
  
  public SeatingChart (List <Student> studentList, int rows, int cols)
  {
    seats = new Student[rows][cols];
    int count = 0;
    for (int c = 0; c < cols; c++)
    {
      for(int r = 0; r < rows; r++)
      {
        if (count >= studentList.size())
          break;
        else
          seats[r][c] = studentList.get(count);
        count++;
      }
    }
  }
  
  public int removeAbsentStudents (int allowedAbs)
  {
    int removed = 0;
    for(int r = 0; r < seats.length; r++)
    {
      for(int c = 0; c < seats[0].length; c++)
      {
        if(seats[r][c] != null)
        {
          if(seats[r][c].getAbs() > allowedAbs)
          {
            removed++;
            seats[r][c] = null;
          }
        }
      }
    }
    return removed;
  }
  
  public boolean switchSeats (int rowA, int colA, int rowZ, int colZ)
  {
    Student temp = seats[rowA][colA];
    if(seats[rowA][colA] == null & seats[rowZ][colZ] == null)
    {
      return false;
    }
    seats[rowA][colA] = seats[rowZ][colZ];
    seats[rowZ][colZ] = temp;
    return true;
  }
  
  public boolean isValidRow (int r)
  {
    if(r >= 0 && r < seats.length)
    {
      return true;
    }
    return false;
  }
  
  public boolean isValidCol (int c)
  {
    if(c >= 0 && c < seats[0].length)
    {
      return true;
    }
    return false;
  }
  
  public String toString()
  {
    String classroom = "";
    for(int r = 0; r < seats.length; r++)
    {
      for(int c = 0; c < seats[0].length; c++)
      {
        if(seats[r][c] == null)
        {
          System.out.println("null " + r + ", " + c);
        }
        else
        {
          System.out.println(seats[r][c] + ", " + r + ", " + c);
        }
      }
    }
    return classroom;
  }
}
