public class Library
{
  public static void main (String []args)
  {
    //Instantiate a client (cl1) and 4 books (b1, b2, b3 and b4)
    Book b1 = new Book("Hamlet", "William Shakespeare");
    Book b2 = new Book("Frankenstein", "Mary Shelley");
    Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
    Book b4 = new Book("The Hunger Games", "Suzanne Collins");
    Client cl1 = new Client("Mrs. Potato");

    //cl1 borrows b1, b2, b3, b4. The client class should generate an error message when b4 is borrowed
    if(cl1.borrowBook(b1))
    {
      System.out.println("Thank you for checking out " + b1);
    }
    else
    {
      System.out.println("You have checked out too many books at this time.");
    }
    if(cl1.borrowBook(b2))
    {
      System.out.println("Thank you for checking out " + b2);
    }
    else
    {
      System.out.println("You have checked out too many books at this time.");
    }
    if(cl1.borrowBook(b3))
    {
      System.out.println("Thank you for checking out " + b3);
    }
    else
    {
      System.out.println("You have checked out too many books at this time.");
    }
    if(cl1.borrowBook(b4))
    {
      System.out.println("Thank you for checking out " + b4);
    }
    else
    {
      System.out.println("You have checked out too many books at this time.");
    }

    //cl1 returns b2
    if(cl1.returnBook(b2))
      System.out.println("Thank you for returning " + b2);
    
    //Display the current state of cl1 (call the toString method)
    System.out.println(cl1);
    
    //Check if cl1 has b1 (yes) and b4 (no)
    if(cl1.hasBook(b1))
      System.out.println(cl1.getName() + " has " + b1);
    else
      System.out.println(cl1.getName() + " doesn't have " + b1);
    
    if(cl1.hasBook(b4))
      System.out.println(cl1.getName() + " has " + b4);
    else
      System.out.println(cl1.getName() + " doesn't have " + b4);
        
    //cl1 returns b4 ( the returnBook method should generate an error message)
    if(cl1.returnBook(b4))
      System.out.println("Thank you for returning " + b4);
    else
      System.out.println("You have not borrowed " + b4);
    
    //cl1 borrows b4
    if(cl1.borrowBook(b4))
      System.out.println("Thank you for checking out " + b4);
    else
      System.out.println("You have checked out too many books at this time.");
        
    //Determine if cl1 can borrow any more books. (no)
    if(cl1.canBorrow())
      System.out.print("You can borrow more books");
    else
      System.out.print("You have checked out too many books at this time.");
  }
}
