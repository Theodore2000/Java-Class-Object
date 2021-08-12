class Teacher {
	String school = "明志科大";
	String job = "老師";
	void work() {
		System.out.println("教書");
	}		
}

public class ex8_7 {
	public static void main(String[] args) {
		Teacher A = new Teacher();
		String course = "計算機概論";
		System.out.println(A.school);
		System.out.println(A.job);
		A.work();
		System.out.println(course);
	}
}