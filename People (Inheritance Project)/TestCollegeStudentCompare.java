public class TestCollegeStudentCompare
{
  public static void main(String[] args)
  {
    CollegeStudent c1 = new CollegeStudent("Alvin", 20, 'M', "123421", 2.4, "Junior", "Marketing", 2027);
    CollegeStudent c2 = new CollegeStudent("Simon", 22, 'M', "124331", 4.0, "Junior", "Data Science", 2027);
    CollegeStudent c3 = new CollegeStudent("Theodore", 17, 'M', "345623", 3.4, "Junior", "Culinary Arts", 2027);
    
    if(c1.compareTo (c2) < 0) // c1 is alphabetically before c2
      System.out.println(c1.getName() + " is alphabetically before" + c2.getName());
    else
      System.out.println(c1.getName() + " is alphabetically after" + c2.getName());
    
    if(c2.compareTo(c3) < 0)
      System.out.println(c2.getName() + " is alphabetically before" + c3.getName());
    else
      System.out.println(c2.getName() + " is alphabetically after" + c3.getName()); 
  }
}
