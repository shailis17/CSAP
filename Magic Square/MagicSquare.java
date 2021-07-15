public class MagicSquare
{
  private int[][] ms;
  public MagicSquare(int[][] square)
  {
    ms = square;
  }
  
  public boolean isMagic()
  {
    if(ms.length != ms[0].length)
      return false;
    if(valuesCheck() == false)
      return false;
    
    int rSum = rowSum(0);
    for(int r = 1; r < ms.length; r++)
    {
      if(rSum != rowSum(r))
        return false;
    }
    
    int cSum = colSum(0);
    for(int c = 1; c < ms.length; c++)
    {
      if(cSum != colSum(c))
        return false;
    }
    
    if(rSum != cSum)
    {
      return false;
    }
    if(diag1() != diag2())
    {
      return false;
    }
    if(diag1() != rSum)
    {
      return false;
    }
    
    return true;
  }
  
  public boolean isA4x4Durer()
  {
    if (isMagic() == false)
      return false;
    if(ms.length != 4)
      return false;
    int rSum = rowSum(0);
    
    if(rSum != cornerSum() || rSum != centerSum() || rSum != ULSum() || rSum != LLSum() || rSum != URSum() || rSum != LRSum() || rSum != topBottomCenterCells() 
                    || rSum != leftRightCenterCells())
    {
      return false;
    }
    
    return true;
  }
  
  private boolean valuesCheck()
  {
    int[] check = new int [(int) Math.pow(ms.length, 2)];
    
    for(int i = 0; i < check.length; i++)
    {
      check[i] = i+1;
    }
   
    boolean onlyOne = false;
    for(int element : check)
    {
      int counter = 0;
      for(int r = 0; r < ms.length; r++)
      {
        for(int c = 0; c < ms[0].length; c++)
        {
          if(ms[r][c] == element)
          {
            counter++;
          }
        }
      }
      
      if(counter == 1)
      {
        onlyOne = true;
      }
      else
      {
        onlyOne = false;
        break;
      }
    }
    return onlyOne;
  }
  
  private int cornerSum()
  {
    int sum = ms[0][0] + ms[0][ms[0].length-1] + ms[ms.length-1][0] + ms[ms.length-1][ms[0].length-1];
    return sum;
  }
  
  private int centerSum()
  {
    int sum = ms[1][1] + ms[1][2] + ms[2][1] + ms[2][2];
    return sum;
  }
  
  private int colSum(int c)
  {
    int sum = 0;
    for(int i = 0; i < ms.length; i++)
    {
      sum += ms[i][c];
    }
    return sum;
  }
  
  private int rowSum (int r)
  {
    int sum = 0;
    for(int i = 0; i < ms[r].length; i++)
    {
      sum += ms[r][i];
    }
    return sum;
  }
  
  private int diag1()
  {
    int sum = 0;
    for(int i = 0; i < ms.length; i++)
    {
      sum += ms[i][i];
    }
    return sum;
  }
  
  private int diag2()
  {
    int sum = 0;
    for(int i = 0; i < ms.length; i++)
    {
      sum += ms[i][ms.length-1-i];
    }
    return sum;
  }
  
  private int ULSum()
  {
    int sum = 0;
    sum += ms[0][0] + ms[0][1] + ms[1][0] + ms[1][1];
    return sum;
  }
  
  private int URSum()
  {
    int sum = 0;
    sum += ms[0][2] + ms[0][3] + ms[1][2] + ms[1][3];
    return sum;
  }
  
  private int LLSum()
  {
    int sum = 0;
    sum += ms[2][0] + ms[2][1] + ms[3][0] + ms[3][1];
    return sum;
  }
  
  private int LRSum()
  {
    int sum = 0;
    sum += ms[2][2] + ms[2][3] + ms[3][2] + ms[3][3];
    return sum;
  }
  
  private int topBottomCenterCells()
  {
    int sum = 0;
    sum += ms[0][1] + ms[0][2] + ms[3][1] + ms[3][2];
    return sum;
  }

  private int leftRightCenterCells()
  {
    int sum = 0;
    sum += ms[1][0] + ms[2][0] + ms[1][3] + ms[2][3];
    return sum;
  }
  
  public String toString()
  {
    String grid = "";
    for(int r = 0; r < ms.length; r++)
    {
      for(int c = 0; c < ms[0].length; c++)
      {
        grid += ms[r][c] + " ";
      }
      grid += "\n";
    }
    return grid;
  }
}
