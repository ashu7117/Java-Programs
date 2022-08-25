class Triangle{
  int a,b,c;
  public double getArea(){
    double s = (a+b+c)/2.0;
    return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
  }
  public double getPerimeter(){
    return (a+b+c);
  }
}

class Ans{
  public static void main(String[] args){
    Triangle t = new Triangle();
    System.out.println(t.getArea());
    System.out.println(t.getPerimeter());
  }
}		