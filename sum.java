import java.util.Scanner;
class ordinary{
	public int sum(){

		for(int i = 0; i<arr.size; i++)

	public int alternate(){
}
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[10];
	System.out.println("Enter size of an array: ");
	int size = sc.nextInt();
	for(int i = 0; i<size; i++)
	{
		System.out.println("Enter "+(i+1)+"st element:");
		arr[i]= sc.nextInt();
	}
	int sum = 0;
	for(int i = 0; i<size; i++)
		{ sum+= arr[i];
}
int alternate = 0;
{
for(int k = 0; k<size; k=k+2)
alternate+= arr[k];}
System.out.println("Sum of array elements is: "+sum);
System.out.println("Sum of alternate elements is: "+alternate);	
}
}
