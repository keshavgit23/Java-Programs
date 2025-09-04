interface Animal
{
    public void sound(); // Abstract method: every animal must implement this
}

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog sounds bhow bhow...!");
    }
}

class Cat implements Animal
{
    public void sound()
    {
        System.out.println("Cat sounds meow meow...!");
    }
}

class Cow implements Animal
{
    public void sound()
    {
        System.out.println("Cow sounds moooo...!");
    }
}

class InterfaceExample 
{
    public static void main(String[] args)
    {
        // Direct object creation and method call
        Dog d = new Dog(); 
        d.sound();
        Cat c = new Cat();
        c.sound();
        Cow co = new Cow();
        co.sound();
        
        System.out.println(); // Separator for output clarity
        
        // Using interface reference (polymorphism)
        Animal a;      
        a = new Dog(); // Interface reference points to Dog object
        a.sound();
        a = new Cat(); // Interface reference points to Cat object
        a.sound();
        a = new Cow(); // Interface reference points to Cow object
        a.sound();
        
        System.out.println(); // Separator for output clarity
        
        // Using array and loop for scalable approach
        Animal[] animals = { new Dog(), new Cat(), new Cow() }; // Array of animals
        for(Animal b : animals) 
        {
            b.sound(); // Dynamic method call based on actual object
        }
    }
}
