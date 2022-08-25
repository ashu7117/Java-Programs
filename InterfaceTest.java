interface Area
{
 final static float pi = 3.14F;
 float compute(float x, float y);
}
class Rectangle implements Area
{
 public float compute(float x, float y)
 {
 return (x*y);
 }
}
class Circle implements Area 
{
  public float compute(float x, float y)
  {
    return(pi*x*x);
  }
} 
class InterfaceTest
{
 public static void main(String[]args)
 {
  Area r = new Rectangle();
  Area c = new Circle();
  System.out.println("Area of Rectangle=" + r.compute(10,20));
  System.out.println("Area of circle=" + c.compute(10,0));
  }
 }