public class CollegeStudent extends Student implements Comparable<CollegeStudent>, Employable
{
  private String year, major;
  private int gradYear;
  
  public CollegeStudent(String n, int a, char g, String ID, double gpa, String y, String m, int gy)
  {
    super(n, a, g, ID, gpa);
    year = y;
    major = m;
    gradYear = gy;
  }
  
  public void getInfo()
  {
  System.out.println("Name:" + super.getName() + " Age:" + super.getAge() + " Gender:" + super.getGender());
  }
  
  public String getYear()
  {
    return year;
  }
  
  public String getMajor()
  {
    return major;
  }
  
  public int getGradYear()
  {
    return gradYear;
  }
  
  public void setYear(String y)
  {
    year = y;
  }
  
  public void setMajor(String m)
  {
    major = m;
  }
  
  public void setGradYear(int gy)
  {
    gradYear = gy;
  }
  
  public String toString()
  {
    return super.toString() + ", Year: " + year + ", Major: " + major + ", Graduating: " + gradYear;
  }
  
  //Part 2: implement comparable interface
  public interface Comparable
  {
  }
  
  public int compareTo(CollegeStudent s)
  {
    if(this.getName().compareTo(s.getName()) < 0)
      return -1;
    else if(this.getName().compareTo(s.getName()) > 0)
      return 1;
    return 0;
  }
  
  //Part 3: isEmployable method
  public boolean isEmployable()
  {
    if(this.getAge() >= 18 && this.getAge() <= 22 && this.getGPA() >= 2.5)
    {
      return true;
    }
    return false;
  }
}
