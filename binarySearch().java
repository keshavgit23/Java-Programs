import java.util.Arrays;

class Main{
    public static void main(String[] args){
        
        int[] intArr = {10,30,28,42,39};
        
        Arrays.sort(intArr);
        
        int intKey = 42;
        System.out.println(intKey+ " " + "Element at index: "+Arrays.binarySearch(intArr,intKey));
    }
}

#Added binarySearch() method program
