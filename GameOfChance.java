import java.util.*;

public class GameOfChance
{
  public static int choice = 1, balance, wager, roll, winningNum, round = 1;
  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    do
    {
      if(round == 1)
      {
        System.out.println("How many points do you have?");
        balance = sc.nextInt();
        System.out.println("How many points do you want to wager?");
        wager = sc.nextInt();
      }
      else
      {
        System.out.println("You have " + balance + " points");
        System.out.println("How many points do you want to wager?");
        wager = sc.nextInt();
      }

      while(validWager(balance, wager) == false)
      {
        System.out.println("Wager invalid... please enter a new wager");
        wager = sc.nextInt();
      }
      roll = rollDice();

      if(round == 1)
        firstRoll(roll);
      else
        secondRoll(roll);
      
    }while(choice == 1);
  }
  
  public static int rollDice()
  {
    Random rand = new Random();
    int dice1 = rand.nextInt(6) + 1;
    int dice2 = rand.nextInt(6) + 1;
    int sum = dice1 + dice2;
    return sum;
  }
  
  public static boolean validWager(int b, int w)
  {
    if(b >= w && w >= 1)
      return true;
    else
      return false;
  }
  
  private static void firstRoll(int r)
  {
    System.out.print("You rolled a " + roll);
    if(r == 2 || r == 3 || r == 12)
    {
      balance -= wager;
      round++;
      System.out.println("\nYou lose! Do you want to play again?");
      System.out.print("1)yes 2)no");
      choice = sc.nextInt();
    }
    else if(r == 7 || r == 11)
    {
      balance += wager;
      round++;
      System.out.println("\nYou win! Do you want to play again?");
      System.out.print("1)yes 2)no");
      choice = sc.nextInt();
    }
    else
    {
      winningNum = r;
      round++;
      secondRoll(winningNum);
    }
  }
  
  private static void secondRoll(int winner)
  {
    int newRoll;
    System.out.println("; You need to roll a " + winner + " to win");
    
    do
    {
      newRoll = rollDice();
      System.out.println("You rolled a " + newRoll);
      if(newRoll == winner)
      {
        balance += wager;
        round++;
        System.out.println("You win! Do you want to play again?");
        System.out.print("1)yes 2)no");
        choice = sc.nextInt();
      }
      else if(newRoll == 7)
      {
        balance -= wager;
        round++;
        System.out.println("You lose! Do you want to play again?");
        System.out.print("1)yes 2)no");
        choice = sc.nextInt();
      }
    }while(newRoll != winner);
  }
}
