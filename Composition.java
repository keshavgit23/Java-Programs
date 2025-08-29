class Room
{
    void bookRoom()
    {
        System.out.println("Room Booked!");
    }
}
    
class SwimmingPool
   {
    void usePool()
    {
      System.out.println("Swimming in the Pool");
    }
  }
  
  class Hotel
  {
      private Room room;
      private SwimmingPool pool;
      
      Hotel()
      {
          room = new Room();
          pool = new SwimmingPool();
      }
      void welcome()
      {
          System.out.println("Welcome to the Hotel!");
      }
      
      void stay()
      {
          room.bookRoom();
          System.out.println("Staying in the Hotel.");
      }
      
      void enjoy() 
      {
          pool.usePool();
          System.out.println("Enjoying hotel facilities.");
      }
      
  }
  class Main
  {
  public static void main (String[] args) {
      Hotel myHotel = new Hotel();
      
      myHotel.welcome();
      myHotel.stay();
      myHotel.enjoy();
  }
 }
 
 /*Welcome to the Hotel!
Room Booked!
Staying in the Hotel.
Swimming in the Pool
Enjoying hotel facilities.*/
