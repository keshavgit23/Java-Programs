import java.util.*;
import java.util.function.Predicate;

class PredicateDemo{
    public static void main(String[] args)
    {
    List<String>n=Arrays.asList("Java","JavaProgram","Array","JVM");
        
 Predicate<String>p = (s)->s.startsWith("J");
        
        for(String st:n)
        {
            if(p.test(st)){
            System.out.println(st);
            }
        }
        
    }
}
