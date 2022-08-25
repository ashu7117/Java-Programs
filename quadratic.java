import java.lang.Math;
import java.util.Scanner;
class quadratic
{
	public static void main(String[]Args)
	{
		Scanner input=new Scanner(System.in);
		double a,b,c,result;
		System.out.println("Input Coefficient a: ");
		a=input.nextDouble();
		System.out.println("Input Coefficient b: ");
		b=input.nextDouble();
		System.out.println("Input Coefficient c: ");
		c=input.nextDouble();
		result=b*b-4.0*a*c;
		if (result>0.0){
			double r1,r2;
			r1=(-b + Math.pow(result, 0.5))/(2.0*a);
			r2=(-b - Math.pow(result, 0.5))/(2.0*a);
			System.out.println("The roots of the quadratic eq. are "+r1+ " and "+r2);
		}
		else if(result==0.0){
			double  r1= -b/(2.0*a);
			System.out.println("The root of the quadratic eq. is "+r1);
		}
		else{
			System.out.println("The equation has no real roots.");
		}

	}
}