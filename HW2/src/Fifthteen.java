import java.util.Scanner;

public class Fifthteen {

	public static void main(String[] args) {
		//15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.
		//(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)
		int answer = 30;
		int a;
		int i;

		for(i=0;i<10;i++)
		{
			System.out.print("���� �Է��ϼ���: ");
			Scanner input = new Scanner(System.in);
			a = input.nextInt();
			
			if(a==answer) 
			break;
			else if(a>answer) {
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�!");
            }
			else {
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�!");
            }
		}
		if(i==10)
			System.out.println("=====Game Over=====");
		else
		    System.out.println("�����Դϴ�.");
		System.out.println("===========���α׷� ����============");
	}

}