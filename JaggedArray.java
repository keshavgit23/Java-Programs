class Jagged
{
	public static void main (String[] args) 
	{
    int[][] arr = {
        {10,20,30,40,50},
        {60,70,80,90},
        {100,110,120},
    };
    
   System.out.println("Element at:"+arr[0][4]+"\n"+"Element at:"+arr[1][0]+"\n"+"Element at:"+arr[2][1]);
   
   //For Loop
   for(int i=0;i<arr.length;i++)
   {
       for(int j=0;j<arr[i].length;j++)
       {
           System.out.println(arr[i][j]+" ");
       }
       System.out.println();
   }
   
   //For-each Loop
   for(int[] row:arr)
   {
       for(int element:row){
       System.out.println(element+arr[0][1]+" ");
   }
   System.out.println();
   }
}
}

#Added Jagged Array program
