package cn.sxt.java2;

/*
Java异常类对象除在程序执行过程中出现异常时由系统自动生成并抛出，也可根据需要使用人工创建并抛出。
①首先要生成异常类对象，然后通过throw语句实现抛出操作(提交给Java运行环境)
  IOException e = new IOException(); 
  throw e;
②可以抛出的异常必须是Throwable或其子类的实例。下面的语句在编译时将会产生语法错误：
	throw new String("want to throw");
*/
public class StudentTest {
	
	public static void main(String[] args) {
		try {
			Student s = new Student();
			s.regist(-1001);
			System.out.println(s);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}

class Student{
	
	private int id;
	
	public void regist(int id) throws Exception {
		if(id > 0){
			this.id = id;
		}else{
//			System.out.println("您输入的数据非法！");
			//手动抛出异常对象
//			throw new RuntimeException("您输入的数据非法！");
//			throw new Exception("您输入的数据非法！");
			throw new MyException("不能输入负数");
			//错误的
//			throw new String("不能输入负数");
		}
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	
}