package cn.sxt.java3;

public class Something {

	public static void main(String[] args) {
		Other o = new Other();
		new Something().addOne(o);
	}

	public void addOne(final Other o) {
		// o = new Other();  //不通过；重新new了一个对象
		o.i++; //编译通过；o这个对象本身没有改变，只是里面的属性改变了
	}
}

class Other {
	public int i;
}


