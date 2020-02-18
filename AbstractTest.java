class shape{
	abstract void draw(){}
	System.out.println("This is a shape.");
}
}
class AbstractTest{
	public static void main(String args[]){
	Shape s=new Shape();
	s.draw();
	}