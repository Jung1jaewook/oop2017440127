import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int i;
		int number;

		System.out.print("���ڸ� �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		for(i=2;i<number;i++) {
			if(number%i==0) 
				break;
		}
		if(i==number)
			System.out.println(number + "�� �Ҽ��Դϴ�.");
		else
			System.out.println(number + "�� �Ҽ��� �ƴմϴ�.");
	}

}
