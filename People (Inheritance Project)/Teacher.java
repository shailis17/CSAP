public class Teacher extends Person
{
  private String subject;
  private int yearsExperience;
  
  public Teacher(String n, int a, char g, String s, int y)
  {
    super(n, a, g);
    subject = s;
    yearsExperience = y;
  }
  
  public String getSubject()
  {
    return subject;
  }
  
  public int getYears()
  {
    return yearsExperience;
  }
  
  public void setSubject(String s)
  {
    subject = s;
  }

  public void setYears(int y)
  {
    yearsExperience = y;
  }
  
  public String toString()
  {
    return super.toString() + ", Subject: " + subject + ", Years Experience: " + yearsExperience;
  }
  
  //Part 3: isEmployable() method
  public boolean isEmployable()
  {
    if(this.getAge() >= 22 && this.getYears() >=5)
    {
      return true;
    }
    return false;
  }
}
