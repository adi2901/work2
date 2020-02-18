abstract class Shape{
	abstract void draw();
	}
	
class Line extends Shape{
	abstract draw(){
	System.out.println("This is point");
	}	
class Rectangle extends Shape{
	abstract draw(){
	System.out.println("This is a Rectangle");
	}	
class Cube extends Shape{
	abstract draw(){
	System.out.println("This is a Cube");
	}	

class ShapeTest{
	public static void main(String args[]){
		Shape s[] = new Shape[3];
		s[0] = new Line;
		s[1] = new Rectangle;
		s[2] = new Cube;
		for(int i=0; i<s.length; i++)
		s[i].draw();
	}
}