class SmallMath {
	int add(int x, int y) {							// ��ƥ[�k
		int z = x + y;
		return z;									// ��¶Ǧ^��ƭ�
	}		
	int sub(int x, int y) {							// ��ƴ�k
		return x - y;								// �Ǧ^��ƹB�⦡
	}
	int mul(int x, int y) {							// ��ƭ��k
		return x * y;								// �Ǧ^��ƹB�⦡
	}
	int div(int x, int y) {							// ��ư��k
		return x / y;								// �Ǧ^��ƹB�⦡
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