import java.util.Scanner;

class Array 
{
  public static void main(String[] args)
  {
      int[][][] arr = new int[3][3][3];
      
      int count=0;
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
             for(int k=0;k<3;k++)
             {
                 arr[i][j][k] = count++;
             }
         }
      }
      
      for(int i=0;i<3;i++)
      {
          System.out.println("Array"+(i+1)+":");
          
          for(int j=0;j<3;j++)
          {
              for(int k=0;k<3;k++)
              {
                  System.out.println(arr[i][j][k]+" ");
              }
              System.out.println();
          }
          System.out.println();
      }
  }
}

#Added 3D array program
