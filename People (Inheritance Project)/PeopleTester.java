public class PeopleTester
{
  public static void main (String[] args)
  {
    Person james = new Student("James", 17, 'M', "123456", 2.67);
    Person kendell = new CollegeStudent("Kendell", 22, 'M', "234567", 3.7, "Senior", "Computer Science", 2026);
    Person logan = new Teacher("Logan", 38, 'M', "Biology", 7);
    printInfo(james);
    printInfo(kendell);
    printInfo(logan);
    System.out.println("");
    ((CollegeStudent) kendell).getInfo();
  }
  
  public static void printInfo(Person p)
  {
  System.out.println("Name:" + p.getName() + " Age:" + p.getAge() + " Gender:" + p.getGender());
  }
}
