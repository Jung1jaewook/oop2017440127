
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	@Override //�� �̰� overriding�ϴ� �ž�... Ʋ���� �ȳ��޼��� ��Ÿ����.
	public void sing() {//(string ss)������ ����.
		System.out.println(name + " �߿�");
	}

}
