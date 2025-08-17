//Program to sort array with quick sort algorithm 
import java.util.Arrays;
import java.util.Scanner;

class QuickSort
{
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    
    static void  quickSort(int[] arr, int low,int high)
    {
       if(low<high) 
       {
           int pi = partition(arr,low,high);
           quickSort(arr,low,pi-1);
           quickSort(arr,pi+1,high);
       }
    }
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Program to Sort an Array with Quick Sort algorithm. ");
	
	System.out.println("Enter size of array: ");
	int n = sc.nextInt();
	System.out.println("Size of array is " + n);
	int[] arr = new int[n];
	System.out.println("Enter "+ n +" Element of Array:");
	for(int i=0;i<n;i++)
	{
	     arr[i] = sc.nextInt();
	}
	
	System.out.println("Original Array: ");
	System.out.print(Arrays.toString(arr));
	
    quickSort(arr,0,n-1);
    System.out.println();
    
    System.out.println("Sorted Array: ");
    System.out.print(Arrays.toString(arr));
    
    sc.close();
	}
}
