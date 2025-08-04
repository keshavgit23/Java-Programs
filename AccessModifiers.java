//Protected example:-
import java.io.*;

class BaseClass
{
    protected void Msg()
    {
        System.out.println("This is a protected method");
    }
    
    public void showProtected()
    {
        BaseClass obj = new BaseClass();
        
        obj.Msg();
    }
}
class Main{
    public static void main (String[] args) 
	{
		BaseClass obj = new BaseClass();
		
		obj.Msg();
    obj.showProtected();

    //This is protected method
    //This is protected method
	}
}

//Private Method:-
import java.io.*;

class BaseClass{
    private int x;
    
    private void Msg(int x)
    {
        
        this.x=x;
    }
     
    public void showPrivate(int a)
    {
      Msg(a);
      System.out.println("Value of X = " + a);
    }
    
	public static void main (String[] args) 
	{
	BaseClass obj = new BaseClass();
	int a = 10;
	
	obj.showPrivate(a);
	//Value of X = 10

	}
}

//Interface with Class:-
import java.io.*;

interface Display
{
    public void showPublic();
    
    default void showDefault()
    {
        System.out.println(" Default Method in interface");
    }
}

class AccessModifiers implements Display
{
     public void showPublic()
     {
         System.out.println("This is public method");
     }
     
     protected void showProtected()
     {
         System.out.println("This is protected method");
     }
     
     private void showPrivate()
    {
        System.out.println("This is private method");
    }
     
    void showPackagePrivate()
    {
        System.out.println("This is package private method");
    }
    
    public void demonstrateAccess()
    {
    showPrivate();
    showProtected();
    showPackagePrivate();
    }
    
}
  public class Main{
      
  public static void main(String[] args)
  {
      AccessModifiers obj = new AccessModifiers();
      obj.showPublic();
      obj.showDefault();
      
      
      obj.demonstrateAccess();
  }
  }
  
  /*This is public method
    Default Method in interface
    This is private method
    This is protected method
    This is package private method*/
