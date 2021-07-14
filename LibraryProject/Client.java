public class Client
{
  private String name;
  private Book bookOne = null, bookTwo = null, bookThree = null;
  
  public Client (String n)
  {
    name = n;
  }
  
  public Client (String n, Book b1)
  {
    name = n;
    bookOne = b1;
  }
  
  public Client (String n, Book b1, Book b2)
  {
    name = n;
    bookOne = b1;
    bookTwo = b2;
  }
  
  public Client (String n, Book b1, Book b2, Book b3)
  {
    name = n;
    bookOne = b1;
    bookTwo = b2;
    bookThree = b3;
  }
  
  public boolean canBorrow()
  {
    if(bookOne == null)
    {
      return true;
    }
    else if(bookTwo == null)
    {
      return true;
    }
    else if(bookThree == null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public boolean returnBook(Book b)
  {
    if(b == bookOne)
    {
      bookOne = null;
      return true;
    }
    else if(b == bookTwo)
    {
      bookTwo = null;
      return true;
    }
    else if(b == bookThree)
    {
      bookThree = null;
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public boolean borrowBook(Book b)
  {
    if(bookOne == null)
    {
      bookOne = b;
      return true;
    }
    else if(bookTwo == null)
    {
      bookTwo = b;
      return true;
    }
    else if(bookThree == null)
    {
      bookThree = b;
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public boolean hasBook(Book b)
  {
    if(b == bookOne)
    {
      return true;
    }
    else if(b == bookTwo)
    {
      return true;
    }
    else if(b == bookThree)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public String toString()
  {
    String print = "Client Name: " + name + "\nBook One: ";
    if(bookOne != null)
    {
      print += bookOne + "\nBook Two: ";
    }
    else
    {
      print += "\nBook Two: ";
    }
    
    if(bookTwo != null)
    {
      print += bookTwo + "\nBook Three: ";
    }
    else
    {
      print += "\nBook Three: ";
    }
    
    if(bookThree != null)
    {
      return print += bookThree;
    }
    else
    {
      return print;
    }
  }
  
  public String getName()
  {
    return name;
  }
}
