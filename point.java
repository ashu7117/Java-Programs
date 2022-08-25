import java.lang.Math;
public class point{
	double x,y;
	double distance;
	point(){
		x=0;
		y=0;
	}
    point(double x,double y){
    	this.x=x;
    	this.y=y;
    }
	public point dist(point p1, point p2){
		point temp=new point();
		temp.x=(p2.x-p1.x)*(p2.x-p1.x);
		temp.y=(p2.y-p1.y)*(p2.y-p1.y);
		temp.distance=Math.sqrt(temp.x+temp.y);
		return temp;
	}
	public void display(double d){
		System.out.printf("Distance between two points is: %7.2f", d);
	}

}
