package cn.sxt.java1;

public class ValueTransferTest3{
	
	public static void main(String args[]){
		ValueTransferTest3 test=new ValueTransferTest3();
		test.first();
	}
	
	public void first(){
		int i=5;
		Value v = new Value();
		v.i=25;
		second(v,i);
		System.out.println(v.i);
	}
	
	public void second(Value v,int i){
		System.out.println("iii" + i);
		i=0;
		v.i=20;
		Value val=new Value();
		v=val;
		System.out.println(v.i+" "+i);
		
	}
}

class Value {
	int i= 15;
}