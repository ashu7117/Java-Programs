import java.util.Scanner;
class Sumofarray{


public int sumofall(int[] x){
int sum = 0;
for(int i = 0; i<5; i++){
sum = sum + x[i];
}
return sum;
}
public int sumofalternate(int[] x)
{
int sum1 = 0;
for(int i = 0; i<5; i=i+2)
{
sum1 = sum1 + x[i];
}
return sum1;
}

public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int x[] = new int[5];
Sumofarray y=new Sumofarray();
System.out.println(" Enter the values");
for (int i = 0; i<5; i++)
{
x[i] = sc.nextInt();
}

System.out.println("Sum of all" +y.sumofall(x));
System.out.println("Sum of alternate" +y.sumofalternate(x));
}
}