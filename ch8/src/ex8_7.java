class Teacher {
	String school = "���Ӭ�j";
	String job = "�Ѯv";
	void work() {
		System.out.println("�Ю�");
	}		
}

public class ex8_7 {
	public static void main(String[] args) {
		Teacher A = new Teacher();
		String course = "�p�������";
		System.out.println(A.school);
		System.out.println(A.job);
		A.work();
		System.out.println(course);
	}
}