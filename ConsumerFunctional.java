import java.util.function.Consumer;

 class ConsumerDemo
   {
       public static void main(String[] args)
       {
     
        Consumer<String>printUpper = str->System.out.println(str.toUpperCase());
        
        printUpper.accept("hello java");
        printUpper.accept("consumer interface");
       }
   }
   
   
