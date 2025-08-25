import java.util.*;

class Parent {
    
}

class Child extends Parent {

    public static void main (String[] args) {
        Parent pobj = new Child();
        
        if (pobj instanceof Parent) {
            System.out.println("pobj is instance of Child");
        } else {
            System.out.println("pobj is not instance of Child");
        }
    }
}
  // Output: pobj is instance of Child
