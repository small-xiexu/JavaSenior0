package cn.sxt.java2;

public class InnerClassTest1 {
	
	
	//开发中很少见
	public void method(){
		//局部内部类
		class AA{
			
		}
	}
	
	
	//返回一个实现了Comparable接口的类的对象
	public Comparable getComparable(){
		
		//创建一个实现了Comparable接口的类:局部内部类
		//方式一：
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//			
//		}
//		
//		return new MyComparable(); //非匿名实现类的匿名对象
		
		//方式二：
		return new Comparable(){ //匿名实现类的匿名对象

			@Override
			public int compareTo(Object o) {
				return 0;
			}
			
		};
		
	}
	
}
