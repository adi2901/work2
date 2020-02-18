class ComplexNo{
	private int realvar;
    private int imagvar;
public ComplexNo(){
    this.realvar=1;
    this.imagvar=1;
}
public ComplexNo(int realvar, int imagvar){
	this.realvar=realvar;
    this.imagvar=imagvar;
}
public int getAdd(){
    return this.realvar+this.imagvar;
}
public int getSub(){
    return this.realvar-this.imagvar;
}
public int getMul(){
    return this.realvar*this.imagvar;
}
}
public class TestComplex{
    public static void main(String args[]){
        ComplexNo C1=new ComplexNo(5,4);
        System.out.println(C1.getMul());
}
}