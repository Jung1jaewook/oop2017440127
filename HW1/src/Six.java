import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		//����� �Է� : �� ���� �� �ڸ� ����
		//��� : �ڸ����� ������ �ݴ�� �� ����
		System.out.println("6�� ����");
		int a;
		int b;
		int c;
        Scanner input = new Scanner(System.in);
		
	    System.out.print("�� �ڸ����� ������ �Է��Ͻÿ�: ");
	    a = input.nextInt();
	    b = a/10;
	    c = a%10;
	    
	    if(a>=100)
	    	System.out.println("�� �ڸ����� ������ �Է����ּ���!");
	    else if(a>=10) {
	    	a = c*10 + b;
	    	System.out.println("�ٲ� ���ڸ����� ����: " + a);
	    }
	    else 
	    	System.out.println("�� �ڸ����� ������ �Է����ּ���!");
	    System.out.println("===========���α׷� ����============");
	}

}