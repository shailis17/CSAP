import java.util.*;

public class DaysElapsed 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int startMonth, startDay, endMonth, endDay, year;
    int [] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30 , 31, 30 , 31};
    int run = 1;
    do
    {
      System.out.println("What year?");
      year = sc.nextInt();
      System.out.println("What is the start month?");
      startMonth = sc.nextInt();
      System.out.println("What is the start date?");
      startDay = sc.nextInt();
      System.out.println("What is the end month?");
      endMonth = sc.nextInt();
      System.out.println("What is the end date?");
      endDay = sc.nextInt();
      if(startMonth <= 12 && startMonth >= 1 && endMonth <= 12 && endMonth >= 1 && endMonth >= startMonth)
      {
        if(startDay <= daysInMonth[startMonth] && endDay <= daysInMonth[endMonth] && startDay != 0 && endDay != 0)
        {
          daysPassed(year, startMonth, startDay, endMonth, endDay);
          System.out.println("Do you want to run again?\n1. Yes\n2. No");
          run = sc.nextInt();
        }
      }
      else
      {
        System.out.println("Error: Invalid Input \nTry Again");
      }
      
    }while(run == 1);
  }

  private static void daysPassed(int year, int startMonth, int startDay, int endMonth, int endDay)
  {
    int daysPassed;
    int [] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30 , 31, 30 , 31};
    boolean leap = isLeapYear(year);
    if(leap)
    {
      daysInMonth[2] = 29;
    }
    if(startMonth == endMonth)
    {
      daysPassed = endDay - startDay + 1;
      System.out.println(daysPassed + " days passed");
    }
    else if(endMonth - startMonth == 1)
    {
      daysPassed = daysInMonth[startMonth] - startDay + endDay + 1;
      System.out.println(daysPassed + " days passed");
    }
    else if(endMonth - startMonth >= 2)
    {
      int monthsPassed = startMonth + 1;
      daysPassed = daysInMonth[startMonth] - startDay + endDay + 1;
      while(monthsPassed < endMonth)
      {
        daysPassed += daysInMonth[monthsPassed];
        monthsPassed++;
      }
      System.out.println(daysPassed + " days passed");
    }
  }
    
  private static boolean isLeapYear(int y)
  {
    boolean isLeap = false;
    if(y%4 == 0)
    {
      isLeap = true;
      if(y%100 == 0)
      {
        isLeap = false;
        if(y%400 == 0)
        {
           isLeap = true;
        }
      }
    }
    return isLeap;
  }

}
