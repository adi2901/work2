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
	public int getReal(){
return this.realvar;
}
public int getImg(){
return this.imagvar;
}

public ComplexNo add(ComplexNo n){
	int myreal=this.realvar+n.real;
	int myimg=this.imagvar+n.imagvar;
	Complex resultObj=new ComplexNo(myreal,myimg);
return	resultObj;
	}	
public String toString(){
return this.getReal()"+" resultObj.getImg() +"i";
}
}
public class TestComplex1{
    public static void main(String args[]){
	ComplexNo n1 = new ComplexNo(5,4);
	ComplexNo n1 = new ComplexNo(15,24);
	ComplexNo resultObj=n1.add(n2);
	System.out.println("Result=" + reultObj);
	}
	}
		