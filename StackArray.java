class StackArray{
	private int ary[];
	
	public StackArray(int ary[]){
		this.ary=ary;
	}
	private int getTop(){
		for(int i=0;i<ary.length;i++){
			if(ary[i]==0){
				return i;
				}
			}
			return 0;
	}
		public boolean push(int x){
		ary[getTop()]=x;
		return true;
		}
		public int pop(){
			int val=ary[getTop()];
		    ary[getTop()]=0;
			return val;
		}
	
	
}
public class TestStackArray{
	public static void main(String args[]){
		int ary[]=new ary[6];
		ary[]={3,5,6,2,8,7};
		push(2);
	}
}