 import java.util.Scanner;
  class test
{
  public static void main(String[] args)
  {
       
       Scanner input=new Scanner(System.in);
       int arr[]=new int[5];
       System.out.println("Enter elements in array");
       for (int i=0;i<=4;i++){
        arr[i]=input.nextInt();
       }
       int min=arr[0];
       int max=arr[0];
       for(int i=0;i<=4;i++)
       {
         if(arr[i]<min)
           {
           min=arr[i];
           }
       }
       for (int j=0;j<=4;j++){
         if(arr[j]>max){
          max=arr[j];
         }
       }
       System.out.println("Maximum element is "+max);
       System.out.println("Minimum element is "+min);
       
       
  }
}