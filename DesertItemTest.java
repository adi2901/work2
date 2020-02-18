abstract class DesertItem{
	int price;
	int item;
	abstract int getCost();
	abstract int getItem();
	}
class Candy extends DesertItem{
	public Candy(int price){
	this.price=price;
	}
	public int getCost(){
	return (this.price)*60;
	}
	public int getItem(){
	return this.item;
	}
}
class Cookie extends DesertItem{
	public Cookie(int price){
	this.price=price;
	}
	public int getCost(){
	return (this.price)*70;
	}
	public int getItem(){
	return this.item;
	}
}
class IceCream extends DesertItem{
	public IceCream(int price){
	this.price=price;
	}
	public int getCost(){
	return this.price;
	}
	public int getItem(){
	return this.item;
	}
}



class DesertItemTest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		DesertItem d[]=new DesertItem[3];
		d[0]=new Candy(2);
		d[1]=new Cookie(3);
		d[2]=new IceCream(50);
		
		int m=0;
		while(m==0)
			{
			System.out.println("Enter 0 for Owner 1 for Customer");
			int n=sc.nextInt();
			if (n==0){
			System.out.println("Enter no. of Candies bought ");
			d[0].item+=(sc.nextInt());
			System.out.println("Enter no. of Cookies bought ");
			d[1].item+=(sc.nextInt());
			System.out.println("Enter no. of IceCream bought ");
			d[2].item+=(sc.nextInt());
			System.out.println("Updated List:");
			System.out.println("No of Candy Bought="+d[0].getItem());
			System.out.println("No of Cookie Bought="+d[1].getItem());
			System.out.println("No of IceCream Bought="+d[2].getItem());
			
			else if(n==1){
				int bill=0;
				double gst=0.04;
				int i=0;
				while(i==0){
				System.out.println("Enetr 1 for Candy 2 for Cookie 3 for IceCream");
				int sw=sc.nextInt();
				switch(sw){
				case 1:System.out.println("Enter No of Candies");
				int a=sc.nextInt();
				if(a<=d[0].getItem()){
				bill+=(d[0].getCost()*a);
				d[0].item-=a;
				}
				else{
					System.out.println("Sorry! Not in Stock");
					}
					break;
					
					case 2:System.out.println("Enter No of Cookies");
				int b=sc.nextInt();
				if(b<=d[1].getItem()){
				bill+=(d[1].getCost()*b);
				d[1].item-=b;
				}
				else{
					System.out.println("Sorry! Not in Stock");
					}
					break;
					
					case 2:System.out.println("Enter No of IceCream");
				int c=sc.nextInt();
				if(c<=d[2].getItem()){
				bill+=(d[2].getCost()*c);
				d[2].item-=c;
				}
				else{
					System.out.println("Sorry! Not in Stock");
					}
					break;
					default: System.out.println("Enter 0 if you want to purchase more or any other toexit");
					i=sc.nextInt();
					}
					System.out.println("Total Bill with Gst= Rs"+(bill+gst*bill));
					System.out.println("Updated List:");
					System.out.println("NO of Candy="+d[0].getItem());
					System.out.println("NO of Cookie="+d[1].getItem());
					System.out.println("NO of IceCream="+d[2].getItem());
					}
					if{
					System.out.println("Wrong choice");
					}
					System.out.println("If you want to place again pree 1");
					m=sc.nextInt();
					}
			}
		}
