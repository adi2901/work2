class Ticket{
	String from;
	String to;
	int seatNo;
	int price;
	public Ticket(String from, String to, int seatNo, int price){
		this.from=from;
		this.to=to;
		this.seatNo=seatNo;
		this.price=price;
		}
	public int getTotalPrice(){
		return this.price*this.seatNo;
		}
	}

class TrainTicket extends Ticket{
	int classes;
	public TrainTicket(String from, String to, int seatNo, int price, int classes){
		super(from, to, seatNo, price);
		this.classes=classes;
		}
		public int getClasses(){
			return this.classes;
		}
	public double getTotalPrice(){
		if(getClasses()==1){
			return super.getTotalPrice()*10;
			}
		else if (getClasses()==2){
			return super.getTotalPrice()*20;
			}
		else
			return super.getTotalPrice()*30;
			
		}
	}
class FlightTicket extends Ticket{
	int weight;
	public FlightTicket(String from, String to, int seatNo, int price, int weight){
		super(from, to, seatNo, price);
		this.weight=weight;
		}
	public int getTotalWeight(){
		return this.weight;
		
	}
	public double getTotalPrice(){
		if(getTotalWeight()<15){
			return (super.getTotalPrice())+(0.01*super.getTotalPrice());
			}
		else if(getTotalWeight()>15){
			return (super.getTotalPrice())+(0.03*super.getTotalPrice());
			}
		}
	}

	class TicketTest{
	public static double getTotalPr(Ticket acc[])
	{ 
	    double totalPrice=0.0;
		for(int i=0;i<acc.length;i++)
		{
			totalPrice+=acc[i].getTotPrice();
		}
		return totalPrice;
	}
	public static void main(String args[])
	{
		Ticket b[]=new Ticket[3];
		b[0]=new Ticket("Bhubaneswar", "Jamshedpur",2,400);
		b[1]=new TrainTicket("Bhubaneswar", "Jamshedpur",3,800,1);
		b[2]=new FlightTicket("Bhubaneswar", "Jamshedpur", 5, 700,16);
		TicketTest.getTotalPr(b);
		System.out.println(TicketTest.getTotalPr(b));
		}
	}