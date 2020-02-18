import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})

@interface Singletone{
	String name;
	int x default 5;
	}

	Singletone(name="Aditya")
	class Order{
		private int price;
		private int quantity;
		public int getPrice(){
			return this.price;
			}
		}
		@Override
		public String toString{
			return "" + this.price+"-"+ this.quantity;
			}
		}
	class OrderTest{
	@SupressWarnings({deprecation, override})
		public static void main(String args[]){
			Order o=new Order();
			System.out.println(order);
			}
		}