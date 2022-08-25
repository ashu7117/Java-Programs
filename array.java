import java.util.Scanner;
class array{
public static void main(String[]args)
{
	Scanner input = new Scanner (System.in);
	int marks[] = new int[5];
	System.out.print("Enter size");
	int n = input.nextInt();
	for (int i = 0; i<n;i++)
	{
		System.out.print("Enter" + (i+1)+"st element: ");
		marks[i] = input.nextInt();
	}
	for(int i =0; i<n; i++)
	{
		System.out.println(marks[i]+ " ");
	}
}
}