import java.util.*;

public class Tester
{
  public static void main(String [] args)
  {
    List<Student> Juniors20 = new ArrayList<Student>();
    Juniors20.add(new Student("Anna", 3));
    Juniors20.add(new Student("Ben", 1));
    Juniors20.add(new Student("Caren", 4));
    Juniors20.add(new Student("David", 1));
    Juniors20.add(new Student("Evan", 5));
    Juniors20.add(new Student("Fran", 9));
    Juniors20.add(new Student("Gina", 2));
    Juniors20.add(new Student("Holly", 6));
    Juniors20.add(new Student("Irene", 1));
    Juniors20.add(new Student("Justin", 3));
    
    SeatingChart myClass = new SeatingChart(Juniors20, 3, 4);
    System.out.println(myClass);
    
    int removedStudents = myClass.removeAbsentStudents(4);
    System.out.println(removedStudents + " were removed");
    System.out.println(myClass);
    
    myClass.switchSeats(2,0,0,3);
    System.out.println(myClass);
  }
}
