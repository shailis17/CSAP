import java.io.*;
import java.util.*;

public class Initials
{
  public static void main (String [] args) throws FileNotFoundException
  {
    int num;
    Scanner sc = new Scanner(new File("/Users/3002821/Desktop/initial_Input.txt"));
    PrintWriter writer = new PrintWriter(new File("/Users/3002821/Desktop/initial_Output.txt"));
    while (sc.hasNext() ) 
    { // reads until EOF
      num = sc.nextInt();
      
      if(num < 0)
      {
        while(num != 0)
        {
        writer.print("*");
        num++;
        }
      }
      else if(num > 0)
      {
        while(num != 0)
        {
        writer.print(" ");
        num--;
        }
      }
      else
      {
        writer.println("");
      }
    }
    writer.close();
  }
}
