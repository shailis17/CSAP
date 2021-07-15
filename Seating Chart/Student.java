public class Student
{
  private String name;
  private int abs;
  
  public Student(String n, int a)
  {
    name = n;
    abs = a;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getAbs()
  {
    return abs;
  }
  
  public String toString()
  {
    return name + "(" + abs + ")";
  }
}
