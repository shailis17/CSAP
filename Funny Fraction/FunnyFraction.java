public class FunnyFraction
{
  private int numerator;
  private int denominator;
  
  public FunnyFraction()
  {
    numerator = 0;
    denominator = 1;
  }
  
  public FunnyFraction(int n, int d)
  {
    numerator = n;
    if(d != 0)
    {
      denominator = d;
    }
    else
    {
      denominator = 1;
    }
  }
  
  public int getNumerator()
  {
    return numerator;
  }
  
  public int getDenominator()
  {
    return denominator;
  }
  
  public String toString()
  {
    return numerator + "/" + denominator;
  }
  
  public FunnyFraction funnyAdd(FunnyFraction f)
  {
    int numAns = numerator + f.numerator + denominator + f.denominator;
    int denAns = (numerator + f.numerator)*(denominator + f.denominator);
    if(denAns == 0)
    {
      denAns = -1;
    }
    FunnyFraction answer = new FunnyFraction(numAns, denAns);
    return answer;
  }
  
  public FunnyFraction funnySubtract(FunnyFraction f)
  {
    int numAns = f.denominator - denominator - f.numerator - numerator;
    int denAns = (f.denominator - denominator)*(f.numerator - numerator);
    if(denAns == 0)
    {
      denAns = -1;
    }
    FunnyFraction answer = new FunnyFraction(numAns, denAns);
    return answer;
  }
  
  public FunnyFraction funnyMult(FunnyFraction f)
  {
    int numAns = (int) Math.sqrt(Math.pow(numerator - f.numerator, 2) + denominator);
    int denAns = (int) (Math.pow(denominator - f.denominator, 2) - f.numerator);
  
    if(denAns == 0)
      denAns = -1;
    
    FunnyFraction answer = new FunnyFraction(numAns, denAns);
    return answer;
  }

  public FunnyFraction funnyDivide(FunnyFraction f)
  {
    int numAns = numerator * f.denominator;
    int denAns = denominator * f.numerator;
    
    if(denAns == 0)
    {
      denAns = -1;
    }
    
    FunnyFraction answer = new FunnyFraction(numAns, denAns);
    return answer;
  }
}
