public class TestMagicSquare
{
  public static void main(String[] args)
  {
    int[][] anySq1 = { {8,1,6}, {3,5,7}, {4,9,2} };
    int [][] anySq2 = { {1,15,14,4},{12,6,7,9},{8,10,11,5},{13,3,2,16} };
    MagicSquare sq1 = new MagicSquare(anySq1); //testing a 3x3 magic square
    MagicSquare sq2 = new MagicSquare(anySq2); //testing a 4X4 durer magic square
    int [][] notMagic1 = { {1,1,1},{1,1,1},{1,1,1} };
    int[][] notMagic2 ={ {1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1} };

    MagicSquare nm1 = new MagicSquare(notMagic1);
    MagicSquare nm2 = new MagicSquare(notMagic2);
    
    //testing a 3x3 magic square >> anySq1 aka sq1
    if (sq1.isMagic())
    System.out.println (sq1 + "is magic!");
    else
    System.out.println(sq1 + "is NOT magic!");
    if (sq1.isA4x4Durer())
    System.out.println("is a Durer Magic Square!");
    else
    System.out.println("is NOT a Durer Magic Square");
    
    //testing a 4X4 durer magic square >> anySq2 aka sq2
    System.out.println("");
    if (sq2.isMagic())
    System.out.println (sq2 + "is magic!");
    else
    System.out.println(sq2 + "is NOT magic!");
    if (sq2.isA4x4Durer())
    System.out.println("is a Durer Magic Square!");
    else
    System.out.println("is NOT a Durer Magic Square");
    
    //testing a 3x3 NOT magic square >> notMagic1 aka nm1
    System.out.println("");
    if (nm1.isMagic())
    System.out.println (nm1 + "is magic!");
    else
    System.out.println(nm1 + "is NOT magic!");
    if (nm1.isA4x4Durer())
    System.out.println("is a Durer Magic Square!");
    else
    System.out.println("is NOT a Durer Magic Square");

    //testing a 4x4 NOT magic square >> notMagic2 aka nm2
    System.out.println("");
    if (nm2.isMagic())
    System.out.println (nm2 + "is magic!");
    else
    System.out.println(nm2 + "is NOT magic!");
    if (nm2.isA4x4Durer())
    System.out.println("is a Durer Magic Square!");
    else
    System.out.println("is NOT a Durer Magic Square");
  }
}
