import java.util.*;

class Main {
    public int square(int x) {
        return x * x;
    }

    public int sum(int pSquare, int bSquare) {
        int add = pSquare + bSquare;
        System.out.println("Addition of Perpendicular Square and Base Square = " + add);
        return add;
    }

    public void solution(int hypotenuseSquare) {
        System.out.println("Hypotenuse square = " + hypotenuseSquare);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();

        System.out.println("Enter Perpendicular:");
        int p = sc.nextInt();

        System.out.println("Enter Base:");
        int b = sc.nextInt();

        int pSquare = m.square(p);
        System.out.println("Perpendicular square = " + pSquare);

        int bSquare = m.square(b);
        System.out.println("Base square = " + bSquare);

        int add = m.sum(pSquare, bSquare);
        m.solution(add); // hypotenuse² = p² + b²
        
      System.out.println("Square root of Hypotenuse = " + Math.sqrt(add));

    }
}

//Enter Perpendicular: 3 
//Enter Base: 4
//Perpendicular square = 9 
//Base square = 16 
//Addition of Perpendicular Square and Base Square = 25 
//Hypotenuse square = 25 
//Square root of Hypotenuse = 5.0
