public class Student implements Comparable
{
  private int age;
  private String name;
  
  public Student(String n, int a)
  {
    name = n;
    age = a;
  }
  
  public String toString()
  {
    return name + "(" + age + ")";
  }
  
  public interface Comparable
  {
  }
  
  @Override
  public int compareTo(Object obj)
  {
    Student s = (Student)obj;
    if(this.name.compareTo(s.name) < 0)
      return -1;
    else if(this.name.compareTo(s.name) > 0)
      return 1;
    else
    {
      if(this.age < s.age)
        return -1;
      else if(this.age > s.age)
        return 1;
    }
    return 0;
  }
}
