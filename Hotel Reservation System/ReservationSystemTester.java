public class ReservationSystemTester
{
  public static void main (String[] args)
  {
    HotelReservation TheTipton = new HotelReservation();
    TheTipton.requestRoom("Zack");
    TheTipton.requestRoom("Cody");
    TheTipton.requestRoom("Maddie");
    TheTipton.requestRoom("London");
    TheTipton.requestRoom("Carey");
    TheTipton.requestRoom("Moseby");
    TheTipton.requestRoom("Esteban");
    TheTipton.requestRoom("Arwin");
    System.out.println(TheTipton);
    
    TheTipton.cancelReassign("Maddie");
    System.out.println(TheTipton);
    TheTipton.cancelReassign("Moseby");
    System.out.println(TheTipton);
    TheTipton.cancelReassign("Zack");
    System.out.println(TheTipton);
    TheTipton.cancelReassign("Cody");
    System.out.println(TheTipton);
    TheTipton.cancelReassign("London");
    System.out.println(TheTipton);
    TheTipton.cancelReassign("Esteban");
    System.out.println(TheTipton);
    TheTipton.cancelReassign("Arwin");
    System.out.println(TheTipton);
    TheTipton.cancelReassign("Carey");
    System.out.println(TheTipton);
  }
}
