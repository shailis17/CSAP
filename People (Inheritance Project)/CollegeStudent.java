public class CollegeStudent extends Student
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
}
