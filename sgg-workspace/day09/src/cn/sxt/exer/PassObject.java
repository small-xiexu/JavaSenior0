package cn.sxt.exer;

/*
 * 练习5：将对象作为参数传递给方法
 * (1)定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * 
 * (2)定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 * public void printAreas(Circle c,int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 
 * (3)在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
 *
 */
public class PassObject {
	
	public static void main(String[] args) {
		
		PassObject test = new PassObject();
		
		Circle c = new Circle();
		
		test.printAreas(c, 5);
		
		System.out.println("\t now radius is " + c.radius);
	}
	
	public void printAreas(Circle c, int time) {
		
		for(int i = 1;i <= time;i++) {
			//设置圆的半径值
			c.radius = i;
			double area = c.findArea();
			System.out.println(c.radius + "\t\t" + area);
		}
		
		c.radius = time + 1;
		
	}

}
