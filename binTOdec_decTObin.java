import java.util.*;

public class binTOdec_decTObin
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int choice, num;
    do
    {
      System.out.println("What would you like to do?");
      System.out.println("1. Binary To Decimal \n2. Decimal to Binary \n0. Exit");
      choice = sc.nextInt();
      if (choice == 1)
      {
        //get users binary number
        System.out.println("What's you binary number?");
        num = sc.nextInt();
        //call bin2Dec
        int errorCheck = bin2Dec(num);
        if(errorCheck == -1)
        {
          System.out.println("Error: not a binary number... try again by choosing option 1");
        }
        else
        {
          System.out.println("Your number = " + bin2Dec(num) + " in decimal");
        }
      }
      else if(choice == 2)
      {
        //get users decimal number
        System.out.println("What's you decimal number?");
        num = sc.nextInt();
        //call dec2Bin
        System.out.println("Your number = " + dec2Bin(num) + " in binary");
      }
    
    }while (choice > 0);
    
    System.out.println("Program Terminated");
    
    }
    
    private static int bin2Dec(int x)
    {
      int digit, exp=0, ans = 0;
      while(x != 0)
      {
        digit = x%10;
        if(digit < 0 || digit > 1)
        {
          ans = -1;
          x = 0;
          break;
        }
        else
        {
          ans = (int) (ans + digit*Math.pow(2,exp));
          exp++;
          x /= 10;
        }
      }
      return ans;
    }
    
  private static String dec2Bin(int x)
  {
    int r;
    String ans = "";
    while(x != 0)
    {
      r = x%2;
      ans = r + "" + ans;
      x /= 2;
    }
    return ans;
  }
}
