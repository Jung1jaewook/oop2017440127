import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina = new Dog();
//		tina.eat();
//		//aaa.eat(); ���� Ŭ�������� ��Ʈ �޼ҵ尡 �����ȵǼ� ����
		//�캯 Ŭ�󽺰� �º� Ŭ���� subclass�̸� ���� ���� ����. �º�(superClass)<--�캯(����� subClass) ������ ����ȯ
		//Upcasting
		//Animal aaa = new Dog();//�º� �캯�� ��� ����. 14���ٰ� ���� �ǹ�.(������)
		Animal aaa = (Animal) new Dog();//13���ٰ� ���� �ǹ�. �� �� �� ��Ӱ��迩�� �Ѵ�.(�����)
		//overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ尡 �����Ѵ�.
		aaa.sing();//////----|||
		aaa = new Cat();//17���ٰ� 19������ ������(Polymorphism)
		aaa.sing();/////-----|||
		//������(polymorphism)
		//1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
		//2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		//3. SuperClass SuperRefVar = new SubClass();
		//3. superRefVar.overrideMethod() -> ��ü�� Ŭ�󽺰� ������ �޼ҵ带 �����Ѵ�. 
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();//���� ���ε�(Dynamic Binding): ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�.
		// �߻� Ŭ���� ��ü�� ���� �� ���� aaa = new Animal();
		
		int a;
		a = (int)3.1;//����ȯ(type casting)
		
	}
}
