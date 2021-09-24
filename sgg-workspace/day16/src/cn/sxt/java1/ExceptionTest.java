package cn.sxt.java1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 一、异常体系结构
 * 
 * java.lang.Throwable
 * 		|-----java.lang.Error:一般不编写针对性的代码进行处理。
 * 		|-----java.lang.Exception:可以进行异常的处理
 * 			|------编译时异常(checked)
 * 					|-----IOException:IO异常
 * 						|-----FileNotFoundException:系统找不到指定路径的异常
 * 					|-----ClassNotFoundException:类找不到异常
 * 			|------运行时异常(unchecked,RuntimeException)
 * 					|-----NullPointerException:空指针异常
 * 					|-----ArrayIndexOutOfBoundsException:数组角标越界异常
 * 					|-----ClassCastException:类型转换异常
 * 					|-----NumberFormatException:数字格式化异常
 * 					|-----InputMismatchException:输入的类型不匹配异常
 * 					|-----ArithmeticException:算术异常
 * 
 * 面试题：常见的异常都有哪些？举例说明?
 *  
 */
public class ExceptionTest {
	
	//******************以下是编译时异常***************************
	@Test
	public void test7(){
//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//		
//		int data = fis.read();
//		while(data != -1){
//			System.out.print((char)data);
//			data = fis.read();
//		}
//		
//		fis.close();
	}
	
	//******************以下是运行时异常***************************
	//ArithmeticException 算术异常
	@Test
	public void test6(){
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
	
	//InputMismatchException 输入的类型不匹配的异常
	@Test
	public void test5(){
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.println(score);
		
		scanner.close();
	}
	
	//NumberFormatException 数字格式化异常
	@Test
	public void test4(){
		
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);
	}
	
	//ClassCastException 类型转换异常
	@Test
	public void test3(){
		Object obj = new Date();
		String str = (String)obj;
	}
	
	//IndexOutOfBoundsException 角标越界异常
	@Test
	public void test2(){
		//ArrayIndexOutOfBoundsException  数组角标越界异常
//		int[] arr = new int[10];
//		System.out.println(arr[10]);
		//StringIndexOutOfBoundsException  字符串角标越界异常
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	
	//NullPointerException 空指针异常
	@Test
	public void test1(){
		
//		int[] arr = null;
//		System.out.println(arr[3]);
		
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
		
	}
	
}
