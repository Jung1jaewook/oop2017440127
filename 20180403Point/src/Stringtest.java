
public class Stringtest {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		str1 = str2;
		System.out.println(str1==str2);//��ȭ��ȣ ���� �޶���.
	}
}
//�Լ��� ����ϱ� ���� �ʿ��� �Ʒ��� ������ ǥ���Ѵ�.
//1.�Լ��̸��� �����Ѵ�.
//2.�Լ��� ��ȯ���� �����Ѵ�.
//3.�Ű������� ������ ���Ѵ�.
//4.�� �Ű������� �ڷ����� �����Ѵ�.
//�Լ��� ����Ϸ��� �̸� �Լ������� �ؾ� �Ѵ�.