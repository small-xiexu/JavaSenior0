package cn.sxt.java;

/*
 * 算法的考察：求数值型数组中元素的最大值、最小值、平均数、总和等
 * 
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求：所有随机数都是两位数。
 * 
 * [10,99]
 * 公式：获取[a,b]范围内的随机数：(int)( Math.random()*(b - a + 1) + a )
 * 								(int)(Math.random() * (99 - 10 + 1) + 10)
 * 
 */
public class ArrayTest1 {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0;i < arr.length;i++) { //[10,99]
			arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
		}
		
		//遍历
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		//求数组的最大值
		int maxValue = arr[0]; //如果随机数是负数，就不能用0，用数组里面的第一个元素
		for(int i = 1;i < arr.length;i++) { //然后数组从第二个元素开始对比
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		System.out.println("最大值为:"+maxValue);
		
		//求数组的最小值
		int minValue = arr[0]; //如果随机数是负数，就不能用0，用数组里面的第一个元素
		for(int i = 1;i < arr.length;i++) { //然后数组从第二个元素开始对比
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		System.out.println("最小值为:"+minValue);
		
		//求数组元素的总和
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("总和为:"+sum);
		
		//求数组元素的平均数
		int avgValue = sum / arr.length;
		System.out.println("平均数为:"+avgValue);
		
	}

}
