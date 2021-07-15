public class TesterTwo
{
  public static void main(String[] args)
  {
    CollegeStudent c1 = new CollegeStudent("Alvin", 20, 'M', "123421", 2.4, "Junior", "Marketing", 2027);
    CollegeStudent c2 = new CollegeStudent("Simon", 22, 'M', "124331", 4.0, "Junior", "Data Science", 2027);
    CollegeStudent c3 = new CollegeStudent("Theodore", 17, 'M', "345623", 3.4, "Junior", "Culinary Arts", 2027);
    
    //Test Comparable interface from College Student
    if(c1.compareTo (c2) < 0) // c1 is alphabetically before c2
      System.out.println(c1.getName() + " is alphabetically before" + c2.getName());
    else
      System.out.println(c1.getName() + " is alphabetically after" + c2.getName());
    
    if(c2.compareTo(c3) < 0)
      System.out.println(c2.getName() + " is alphabetically before" + c3.getName());
    else
      System.out.println(c2.getName() + " is alphabetically after" + c3.getName()); 
    
    //Test the isEmployable method for college students and teachers
    //using college students from part 2
    if(c1.isEmployable())
      System.out.println(c1.getName() + " is employable");
    else
      System.out.println(c1.getName() + " is not employable");
    
    if(c2.isEmployable())
      System.out.println(c2.getName() + " is employable");
    else
      System.out.println(c2.getName() + " is not employable");
    
    if(c3.isEmployable())
      System.out.println(c3.getName() + " is employable");
    else
      System.out.println(c3.getName() + " is not employable");

    //Teachers isEmployable() test
    Teacher t1 = new Teacher("Phineas", 19, 'M', "Engineering", 8);
    Teacher t2 = new Teacher("Ferb", 24, 'M', "Quantum Physics", 10);
    Teacher t3 = new Teacher("Candace", 27, 'F', "Web Design", 3);
    
    if(t1.isEmployable())
      System.out.println(t1.getName() + " is employable");
    else
      System.out.println(t1.getName() + " is not employable");
    
    if(t2.isEmployable())
      System.out.println(t2.getName() + " is employable");
    else
      System.out.println(t2.getName() + " is not employable");
    
    if(t3.isEmployable())
      System.out.println(t3.getName() + " is employable");
    else
      System.out.println(t3.getName() + " is not employable");
  }
}
