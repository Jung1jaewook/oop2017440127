import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		//1���� 9������ ���� �ϳ��� �Է� �޾� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(5�̸� 5���� ���)
		// 9. ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, 
		//�� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� 
		//�ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)

		int dan=0;
		int num = 1;
		int result;
		
		Scanner input = new Scanner(System.in);
	    System.out.print("��(�ڿ���)�� �Է��Ͻÿ�: ");
	    dan = input.nextInt();
	    while(dan>=1) {
	    	while(dan>9)
	    	{
	    		System.out.println("1�̻� 9������ ������ �Է����ּ���!");
	    	    System.out.print("���� �Է��Ͻÿ�: ");
	    	    dan = input.nextInt();
	    	}

	    	while(num<=9)
	    {
	    	result = dan*num;
	    	System.out.println(dan + "X" +  + num + "=" + result);
	    	num++;
	    	}
	    }
	}
}