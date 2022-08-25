import java.util.Scanner;
class arrayindex{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter "+(i+1)+"st element: ");
			arr[i]=input.nextInt();
		}
		System.out.print("Enter number you want to search: ");
		int x=input.nextInt();
		for (int j=0;j<n;j++){
			if ( arr[j]==x ){
				System.out.println("The index number is "+j);
			}
		}
	}
}