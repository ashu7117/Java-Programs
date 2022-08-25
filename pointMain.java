import java.util.Scanner;
class distance{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x1,y1,x2,y2;
		System.out.print("Enter x1: ");
		x1=input.nextDouble();
		System.out.print("Enter y1: ");
		y1=input.nextDouble();

		System.out.println();
		
		System.out.print("Enter x2: ");
		x2=input.nextDouble();
		System.out.print("Enter y2: ");
		y2=input.nextDouble();
		point obj=new point();
		point p1=new point(x1,y1);
		point p2=new point(x2,y2);
		double d=obj.dist(p1,p2).distance;
		obj.display(d);
	}
}