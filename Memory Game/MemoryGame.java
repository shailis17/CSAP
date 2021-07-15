import java.util.*;
public class MemoryGame
{
  static Card[] myDeck = createDeck();
  static Card[][] board = new Card[5][6];

  public static void main(String[] args)
  {
    shuffle(myDeck);
    for(int i = 0; i < myDeck.length; i++)
    {
      board[i/6][i%6] = myDeck[i];
    }
    playGame();
  }
  
  public static Card[] createDeck()
  {
    Card [] deck = {
                      new Card("♦", "2"),
                      new Card("♦", "3"),
                      new Card("♦", "4"),
                      new Card("♦", "5"),
                      new Card("♦", "6"),
                      new Card("♦", "7"),
                      new Card("♦", "8"),
                      new Card("♦", "9"),
                      new Card("♦", "10"),
                      new Card("♦", "J"),
                      new Card("♦", "Q"),
                      new Card("♦", "K"),
                      new Card("♦", "A"),
                      new Card("♠", "2"),
                      new Card("♠", "3"),
                      new Card("♠", "4"),
                      new Card("♠", "5"),
                      new Card("♠", "6"),
                      new Card("♠", "7"),
                      new Card("♠", "8"),
                      new Card("♠", "9"),
                      new Card("♠", "10"),
                      new Card("♠", "J"),
                      new Card("♠", "Q"),
                      new Card("♠", "K"),
                      new Card("♠", "A")
                   };

    return deck;
    }
  
  public static void shuffle (Card [] deck)
  {
    Random rand = new Random();
    for (int i = deck.length - 1 ; i > 0; i--)
    {
      int pos = rand.nextInt(i);
      Card temp = deck[pos];
      deck[pos] = deck[i];
      deck[i] = temp;
    }
  }
  
  public static void playGame()
  {
    Scanner sc = new Scanner(System.in);
    int r1, r2, c1, c2;
    Card xCard = new Card("","X");
    Card oCard = new Card("", "O");
    Card[][] xBoard = new Card[5][6];
    
    for(int r = 0; r < xBoard.length; r++)
    {
      for(int c = 0; c < xBoard[0].length; c++)
      {
      xBoard[r][c] = xCard;
      }
    }
    
    for(int i = 2; i < xBoard[0].length; i++)
    {
      xBoard[4][i] = new Card("","N");
    }
   
    display(xBoard);
    
    while(!allMatched(xBoard))
    {
      System.out.println("Enter the row for card1:");
      r1 = sc.nextInt() - 1;
      System.out.println("Enter the column for card1:");
      c1 = sc.nextInt() - 1;
      System.out.println("Enter the row for card2:");
      r2 = sc.nextInt() - 1;
      System.out.println("Enter the column for card2:");
      c2 = sc.nextInt() - 1;
      if(validateInput(r1, c1, xBoard) && validateInput(r2, c2, xBoard))
      {
        System.out.println("You picked: " + board[r1][c1] + " & " + board[r2][c2]);
      
        if(board[r1][c1].getFace() == board[r2][c2].getFace())
        {
        xBoard[r1][c1] = oCard;
        xBoard[r2][c2] = oCard;
        System.out.println("You found a match: " + board[r1][c1] + " and " + board[r2][c2]);
        }
        else
        {
        System.out.println("Not a match, try again");
        }
        display(xBoard);
        allMatched(xBoard);
      }
      else
      {
        System.out.print("The card input is invalid!");
      }
    }
    System.out.println("You win, you matched all the cards!!!");
  }
  
  public static boolean allMatched(Card[][] grid)
  {
    boolean matched = true;
    Card xCard = new Card("","X");
    for(int r = 0; r < grid.length; r++)
    {
      for(int c = 0; c < grid[0].length; c++)
      {
        if(!grid[r][c].equals(xCard))
        {
          matched = false;
          break;
        }
      }
    }
    return matched;
  }
  
  public static boolean validateInput(int r, int c, Card[][]grid)
  {
    Card oCard = new Card("", "O");
    Card nCard = new Card("","N");
    if(r > 5 || r < 0)
      return false;
    if(c > 6 || c < 0)
      return false;
    if(grid[r][c].equals(oCard) || grid[r][c].equals(nCard) || grid[r][c] == null)
      return false;
    else
      return true;
  }
  
  public static void display(Card[][] grid)
  {
    for(int r = 0; r < grid.length; r++)
    {
      for(int c = 0; c < grid[0].length; c++)
      {
        if(grid[r][c] == null)
          System.out.print(" N ");
        else
          System.out.print(grid[r][c] + " ");
      }
      System.out.print("\n");
    }
  }
  
}
