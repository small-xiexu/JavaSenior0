package cn.sxt.exer;

/*
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积
 */

//测试类
public class CircleTest {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 2;
		c1.findArea();
	}
	
}

//圆
class Circle{
	
	//属性
	double radius;
	
	//求圆的面积
	//方式一：
//	public double findArea() {
//		double area = Math.PI * radius * radius;
//		return area;
//	}
	
	//方式二：
	public void findArea() {
		double area = Math.PI * radius * radius;
		System.out.println("面积为 " + area);
	}
	
}
