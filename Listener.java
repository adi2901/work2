class Bloodpressure{
	private int bp;
	public Bloodpressure(int bp){
		this.bp=bp;
		}
	public int getBp(){
	return this.bp;
	}
	class Measure{
		public int getMeasure(){
			if(getBp()<140){
				System.out.println("Alert! This is too low bp ");
				}else{
					System.out.println("Keep it like this.");
					}
					return getBp();
		}
	}
}
	
	class Listener{
		public static void main(String args[]){
			Bloodpressure b=new Bloodpressure(156);
			Bloodpressure.Measure m= b.new Measure();
			System.out.println(m.getMeasure());
			
		}
	}