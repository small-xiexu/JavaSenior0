package cn.sxt.java1;

/*
 * 方法形参的传递机制：值传递
 * 
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 *   
 * 2.值传递机制：
 * 如果形参是基本数据类型，此时实参赋给形参的是：实参真实存储的数据值
 * 如果形参是引用数据类型，此时实参赋给形参的是：实参存储数据的地址值
 * 
 */
public class ValueTransferTest1 {

	public static void main(String[] args) {
		
		int m = 10;
		int n = 20;
		
		System.out.println("m = " + m + ", n = " + n); // m = 10, n = 20
		//交换两个变量的值的操作
//		int temp = m;
//		m = n;
//		n = temp;
		ValueTransferTest1 test = new ValueTransferTest1();
		test.swap(m, n); //此时的m,n是实参
		
		System.out.println("m = " + m + ", n = " + n); // m = 10, n = 20
		
		
	}
	
	public void swap(int m,int n) { //m,n是形参
		int temp = m;
		m = n;
		n = temp;
	}
	
}
