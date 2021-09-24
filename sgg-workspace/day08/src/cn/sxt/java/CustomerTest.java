package cn.sxt.java;

/*
 * 类中方法的声明和使用
 * 
 * 方法：描述类应该具有的功能
 * 比如：Math类：sqrt() \ random()
 * 
 * 
 * 2.方法的声明：权限修饰符 返回值类型 方法名(形参列表){
 * 							方法体
 *					 }
 * 
 * 3.说明：
 * 		3.1关于权限修饰符：
 * 			Java规定的四种权限修饰符：private、public、缺省(默认)、protected
 * 
 * 		3.2返回值类型：有返回值  VS  没有返回值
 * 			3.2.1如果方法有返回值，则必须在方法声明时，指定返回值的类型。
 * 					同时，方法中需要使用return关键字来返回指定类型的变量或常量	
 * 				 如果方法没有返回值，则方法声明时，使用void来表示。
 * 					通常，没有返回值的方法，就不需要使用return。
 * 					但是如果使用的话，只能使用"return;"，表示结束此方法的意思
 * 		
 * 		3.3方法名：属于标识符，遵循标识符的规则和规范，"见名知意"
 * 
 * 		3.4形参列表：方法可以声明0个，1个，或者多个形参
 * 			3.4.1 格式：数据类型1 形参1，数据类型2 形参2，...
 * 			
 * 		3.5方法体：方法功能的体现
 * 
 * 	4.return关键字的使用：
 * 			1.使用范围：使用在方法体中
 * 			2.作用：①结束方法
 * 					②针对于有返回值类型的方法，使用"return 数据"方法返回所需要的数据
 * 			3.注意点：return关键字后面不可以声明执行语句
 * 	
 *  5.方法的使用：可以调用当前类的属性或方法
 *  	特殊的：方法A中又调用了方法A：递归方法
 *  	方法中，不可以再定义方法
 */
public class CustomerTest {
	
	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.eat();
		cust.sleep(8);
	}

}

class Customer{
	
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat() {
		System.out.println("客户吃饭");
	}
	
	public void sleep(int hour) {
		System.out.println("休息了" + hour + "个小时");
		eat();
	}
	
	public String getName() {
		if(age > 18) {
			return name;
		}else {
			return "Tom";
		}
		
	}
	
	public String getNation(String nation) {
		String info = "我的国籍是" + nation;
		return info;
	}
	
}
