class SmallMath {
	int add(int x, int y) {							// 整數加法
		int z = x + y;
		return z;									// 單純傳回整數值
	}		
	int sub(int x, int y) {							// 整數減法
		return x - y;								// 傳回整數運算式
	}
	int mul(int x, int y) {							// 整數乘法
		return x * y;								// 傳回整數運算式
	}
	int div(int x, int y) {							// 整數除法
		return x / y;								// 傳回整數運算式
	}
}

public class ex8_3 {
	public static void main(String[] args) {
		SmallMath A = new SmallMath();
		System.out.println(A.add(10, 20));
		System.out.println(A.sub(10, 20));
		System.out.println(A.mul(10, 20));
		System.out.println(A.div(10, 20));
	}
}