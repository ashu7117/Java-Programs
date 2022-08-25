import java.util.Scanner;
class pattern1
{
	public static void main(String[]Args)
	{
		Scanner input=new Scanner(System.in);
		int row;
		System.out.println("Enter no. of rows: ");
		row=input.nextInt();
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<=i;j++)
			{

				System.out.print("*");
			}
			System.out.println();
		}
	}
}