import java.util.Scanner;

class ArmstrongCheck {
static void putData(int num)
{
        int original = num;
        int n = 0;
        int temp = num;

        // Count number of digits
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        int sum = 0;
        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

  }
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        putData(num);
        
        sc.close();
    }
           
}

#Added Armstrong number program
