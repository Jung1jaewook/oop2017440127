import java.util.Scanner;

public class Twentyone {

	public static void main(String[] args) {
		// 21.����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int i;
		int number;
		int sum = 0;
		int a;

		System.out.print("���ڸ� �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		for(i=2;i<number;i++) {

			for(a=2;a<i;a++) {
				if(i%a==0) 
					break;
			}
			if(a==i)
				sum +=a;
		}
		System.out.println(number + "������ �Ҽ����� ���� " + sum + "�Դϴ�.");
	}
}
