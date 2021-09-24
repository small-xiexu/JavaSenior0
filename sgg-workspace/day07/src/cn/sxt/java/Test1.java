package cn.sxt.java;

public class Test1 {
	
	public static void main(String[] args) {
		int[] arr = new int[] {43,32,76,-98,22,0,64,33,-21,32,99};
		int dest = 222;
		int i;
		for(i = 0;i < arr.length;i++) {
			
			if(dest == arr[i]) {
				System.out.println(i);
				break;
			}
			
		}
		
		if(i == arr.length) {
			System.out.println("没有找到!");
		}
		
		
	}

}
