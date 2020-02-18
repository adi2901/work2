import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})

@interface Getter{
	int value() default 0;
	@Getter(value=5)
	
}
class Order{
private int price;
private int quantity;

	public Order(int price,int quantity){
		this.price=price;
		this.quantity=quantity;
		}
		@Getter
		public int getPrice( ){
			return this.price;
		}
		@Getter
		public void foo(){
			System.out.println("This is foo");
		
		}
}
		
	class OrderMain{
	public static void main(String args[]){
		Class c=Class.forName("Order");
		Method m[]=c.getDeclaredMethods();
		for(int i=0;i<m.length;i++){
			Method myMethod=m[i];
			Annotation annotations[]=myMethod.getAnnotations();
			for(--){
				//check whether @Getter used
				if Yes
				write logic 
			}
		}
		Order o=new Order(23,45);
		o.getPrice();
		o.foo();
		}
	}
		