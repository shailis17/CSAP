import java.util.Random;

public class Statistics
{
  public static void main(String[] args)
  {
    int[] rolls = new int[1000];
    
    for(int j = 0; j < rolls.length; j++)
    {
    rolls[j] = rollDice();
    }
    
    System.out.println(toString(rolls));
    System.out.println("\nThe average number you rolled is " + calcAvg(rolls));
    System.out.println("The smallest number you rolled is a " + getMin(rolls));
    System.out.println("The largest number you rolled is a " + getMax(rolls));
    System.out.println("The standard deviation you rolled is a " + calcStdDev(rolls));
    System.out.println("\nHistogram:");
    displayHistogram(rolls);
  }
  
  public static int rollDice()
  {
    Random rand = new Random();
    int d1 = rand.nextInt(6) + 1;
    int d2 = rand.nextInt(6) + 1;
    int d3 = rand.nextInt(6) + 1;
    int sum = d1 + d2 + d3;
    return sum;
  }

  public static double calcAvg(int[] arr)
  {
    int sum = 0;
    for(int element : arr)
    {
    sum += element;
    }
    double average = sum/arr.length;
    return average;
  }
  
  public static int getMin(int[] arr)
  {
    int min = arr[0];
    for(int element : arr)
    {
      if(element < min)
      {
        min = element;
      }
    }
    return min;
  }
  
  public static int getMax(int[] arr)
  {
    int max = arr[0];
    for(int element : arr)
    {
      if(element > max)
      {
        max = element;
      }
    }
    return max;
  }
  
  public static double calcStdDev(int[] arr)
  {
    double sum = 0;
    double mean = calcAvg(arr);
    for(int element : arr)
    {
      sum += Math.pow(element - mean, 2);
    }
    double stdDev = Math.sqrt(sum/(arr.length - 1));
    return stdDev;
  }
  
  public static void displayHistogram(int[] arr)
  {
    //Instantiate/populate
    int[] freq = new int[18];
    for(int j = 0; j < freq.length; j++)
    {
      freq[j] = j+1;
    }
    
    //Displays a histogram
    int counter = 0, current, numStars = 0;
    for(int j = 0; j < freq.length; j++)
    {
      System.out.print(freq[j] + " | ");
      for(int element : arr)
      {
        current = freq[j];
        if(element == current)
        {
          counter++;
        }
      }
      counter /= 5;
      //System.out.print(counter + ", " + numStars);
      for(int x = 0; x < counter; x++)
      {
        System.out.print("*");
      }
      if(counter != 0 && counter%5 != 0)
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
  
  public static String toString(int[] arr)
  {
    String grid = "";
    for(int i = 0; i < arr.length; i++)
    {
      if(i%25 == 0)
      {
        grid += "\n";
      }
      grid += arr[i] + " ";
    }
    return grid;
  }
}
