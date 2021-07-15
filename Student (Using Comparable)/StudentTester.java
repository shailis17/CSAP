public class StudentTester
{
  public static void main(String[] args)
  {
    Student s1 = new Student("Sam", 21);
    Student s2 = new Student("Sam", 21);
    Student s3 = new Student("Phineas", 11);
    Student s4 = new Student("Ferb", 12);
    
    if(s1.compareTo(s2) > 0)
      System.out.print(s1 + " is greater than " + s2);
    else if(s1.compareTo(s2) < 0)
      System.out.print(s1 + " is less than " + s2);
    else
      System.out.print(s1 + " is equal than " + s2);
    System.out.println("");
    
    if(s3.compareTo(s4) > 0)
      System.out.print(s3 + " is greater than " + s4);
    else if(s3.compareTo(s4) < 0)
      System.out.print(s3 + " is less than " + s4);
    else
      System.out.print(s3 + " is equal than " + s4);
  }
}
