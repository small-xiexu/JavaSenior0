package cn.sxt.java2;

public class ReturnExceptionDemo {
	static void methodA() {
		try {
			System.out.println("进入方法A"); //①
			throw new RuntimeException("制造异常"); //③
		} finally {
			System.out.println("用A方法的finally"); //②
		}
	}

	static void methodB() {
		try {
			System.out.println("进入方法B"); //①
			return;  //③
		} finally {
			System.out.println("调用B方法的finally");  //②
		}
	}

	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		methodB();
	}
}
