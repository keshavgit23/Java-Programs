abstract class Person{
   abstract void eat();
}
interface Person1{
    void chew();
}
  class AnonymousDemo{
      public static void main(String[] args){
          //Anonymous class for Abstract //Class
          Person p = new Person(){
             @Override
           void eat()
           {
               System.out.println("Eating Something...");
           }
        };
           p.eat();
          
          //Anonymous class for interface
          Person1 p1 = new Person1(){
            @Override
       public void chew()
          {
              System.out.println("Person is Chewing...");
          }
         };
         p1.chew();
      }
  }
/* Output: Eating Something...
           Person is Chewing... */
