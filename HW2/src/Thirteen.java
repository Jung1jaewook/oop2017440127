import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		// 13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���) //1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		int month, day;
		System.out.print("month�� �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		
		System.out.print("day�� �Է��ϼ���: ");
		day = input.nextInt();
		
		switch(month-1) {
		case 11:
			day+=30;
		case 10:
			day+=31;
		case 9:
			day+=30;
		case 8:
			day+=31;
		case 7:
			day+=31;
		case 6:
			day+=30;
		case 5:
			day+=31;
		case 4:
			day+=30;
		case 3:
			day+=31;
		case 2:
			day+=28;
		case 1:
			day+=31;
		}
		System.out.println("1�� 1�Ϻ����� �� day���� " + day + "���Դϴ�.");
		System.out.println("===========���α׷� ����============");
	}
}
