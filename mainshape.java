class Shape{
	void display(){
		System.out.println("This is a Shape");
	}
}
class Rectangle extends Shape{
	void display_rect(){
		System.out.println("This is a Rectangular Shape");
	}
}
class Circle extends Shape{
	void display_circle(){
		System.out.println("This is a Circular Shape");
	}
}
class Square extends Rectangle{
	void display_sq(){
		System.out.println("Square is a Rectangle");
	}
}
class mainshape{
	public static void main(String[] args) {
		Square sq=new Square();
		sq.display();
		sq.display_rect();
		sq.display_sq();
	}
}