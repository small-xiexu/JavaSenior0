package cn.sxt.exer;

/* 考查多态的笔试题目：
 * 面试题：多态是编译时行为还是运行时行为？如何证明？
 * 
 * 拓展问题
 */
public class InterviewTest1 {

	public static void main(String[] args) {
		Base1 base = new Sub1();
		base.add(1, 2, 3); //编译时无法确定到底是调用哪个方法

//		Sub1 s = (Sub1)base;
//		s.add(1,2,3);
	}
}

class Base1 {
	public void add(int a, int... arr) {
		System.out.println("base1"); 
	}
}

class Sub1 extends Base1 {
	
	public void add(int a, int b, int c) {
		System.out.println("sub_2");
	}

	public void add(int a, int[] arr) {
		System.out.println("sub_1");
	}
	
}