
public class Test {

	public static void main(String[] args) {
		
		point p;
		p = new point(); //����Ʈ ��ü ���� �� ���۷���  p�� ����
		
		//��ü�� �ʵ� ����
//		p.x = 1.0;// ����Ʈ ���� �ʵ� x
//		p.y = 1.0;//public ���� ���.
		
		
		double temp = 1.0;
		
		p.setX(temp);//�����ڸ� ����� �ʵ� ����
		System.out.println("temp=" + temp);
		
		p.setY(temp);;//������. 1.0�־ ��
		
//		System.out.println(p.getX());//������
//		System.out.println(p.distance());//p ��ü�� distance() �Լ� ȣ��
	}
}
//�Լ�ȣ�� �� 
//1. �Ű������� �����ϱ� ���� �޸� ������ ���� �����ȴ�.
//2. �Ű������� ���� ���� ������ �޸� �������� ����ȴ�.
//3. �Լ� �������� ���� ������ �޸𸮿����� �����Ѵ�.
//4. �Լ��� ����Ǹ� ������ �޸� ������ �Ҹ�ȴ�
//c 12 �޸� ����, ���ȭ, ����ü�� ������.