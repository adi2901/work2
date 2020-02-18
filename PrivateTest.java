class PrivateField{
	private void method(){
		System.out.println("This is Private.");
		}
	}
class PrivateTest{
	public static void main(String args[])throws Exception{
		PrivateField pvr=new PrivateField();
		Class cls=pvr.getClass();
		System.out.println(cls.getName());
		Method methods[]=cls.getDeclaredMethods();
		for(int i=0;i<methods.length;i++){
			System.out.println(methods[i]);
			
		}
		}
	}