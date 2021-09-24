package cn.sxt.java2;

/*
1.一般地，用户自定义异常类都是RuntimeException的子类。
2.自定义异常类通常需要编写几个重载的构造器。
3.自定义异常需要提供serialVersionUID
4.自定义的异常通过throw抛出。
5.自定义异常最重要的是异常类的名字，当异常出现时，可以根据名字判断异常类型。

如何自定义异常类？
1. 继承于现有的异常结构： RuntimeException 、Exception
2. 提供全局常量：serialVersionUID
3. 提供重载的构造器
 */
public class MyException extends Exception{
	
	static final long serialVersionUID = -7034897193246939L;
	
	public MyException(){
		
	}
	
	public MyException(String msg){
		super(msg);
	}
}
