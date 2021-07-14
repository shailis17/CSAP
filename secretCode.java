import java.util.*;
public class secretCode
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input;
    int code;
    do
    {
      System.out.println("Enter message: ");
      input = sc.nextLine();
    }while(isValidLength(input) == false);
    
    code = StringToInt(input);
    code = getNumDigits(code);
    System.out.println("Secret Code: " + getSecretCode(code));
  }
  
  public static boolean isValidLength (String s)
  {
    if(s.length() >= 2 && s.length() <= 12)
      return true;
    else
      return false;
  }
  
  public static int StringToInt(String s)
  {
    int sum = 0;
    for(int i = 0; i < s.length(); i++)
    {
      char c = s.charAt(i);
      sum += (int) c;
    }
    return sum;
  }
  public static int getNumDigits (int n)
  {
    int numDigits = 0;
    int code = n;
    while(n > 0)
    {
      n /= 10;
      numDigits++;
    }
    if(numDigits % 2 != 0)
    {
      code *= 10;
    }
    return code;
  }
  public static String getSecretCode (int num)
  {
    if(num <= 4000)
    {
      num *= 4;
    }
    
    int numDigits = 0, code = num;
    
    while(num > 0)
    {
      num /= 10;
      numDigits++;
    }
    
    if(numDigits % 2 != 0)
    {
      code /= 10;
    }
    
    int firstHalf = code/100, secondHalf = code % 100;
    
    if(firstHalf <= 65)
    {
      firstHalf += 61;
    }
    if(secondHalf <= 65)
    {
      secondHalf += 61;
    }
    
    String secretCode = Character.toString((char) firstHalf) + Character.toString((char) secondHalf);
    
    return secretCode;
  }
}
