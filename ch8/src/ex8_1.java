class Dog {
	String name;		// �W�r
	String color;		// �C��
	int age;			// �~��
	void barking( ) {	// ��kbarking()
		System.out.println("�ڪ����b�s");
	}
	void eating( ) {	// ��kbarking()
		System.out.println("�ڦb�Y�F��");
	}
}

public class ex8_1 {
	public static void main(String[] args) {
		Dog myDog = new Dog();		// �ŧi�P�إ�myDog����
		myDog.name = "Lily";		// �]�wmyDog��name�ݩ�
		myDog.color = "White";		// �]�wmyDog��color�ݩ�
		myDog.age = 5;				// �]�wmyDog��age�ݩ�
		System.out.println("�ڪ����W�r�O : " + myDog.name);
		System.out.println("�ڪ����C��O : " + myDog.color);
		System.out.println("�ڪ����~�֬O : " + myDog.age);	
		myDog.barking();			// �I�s��kbarking()
		myDog.eating();			// �I�s��kbarking()
	}
}