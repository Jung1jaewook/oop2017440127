package jjw;

public class Dog extends Animal {
	public Dog() {//����Ʈ ������/ ����Ʈ ���� �� �з�Ʈ�� ����Ʈ�� ���� ���ư�. ������
		//����� ����Ŭ���� ������ ȣ�� super();//explicitly������ parent�� ������ ����
		System.out.println("Dog ����Ʈ ������");
	}//�� �����ڴ� Dog�� Ư���� ������ ����. //overriding�� sub�� ����
	public Dog(int a) {//����Ʈ �ƴ�
		super(a);//������� ����. ���������� �ϸ� ����Ʈ �����ڸ� �ҷ���
		System.out.println("Dog ������ ������");
	}
	
}
