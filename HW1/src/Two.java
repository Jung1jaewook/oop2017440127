import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("2�� ����");
        //2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a;
		int num;
		Scanner input = new Scanner(System.in);
	    System.out.print("�ϳ��� ������ �Է��Ͻÿ�: ");
	    a = input.nextInt();
	    num = a%2; 
	    if(num==0)
	    	System.out.println("�� ���ڴ� ¦���Դϴ�.");
	    else
	    	System.out.println("�� ���ڴ� Ȧ���Դϴ�.");
		System.out.println("=======���α׷� ����=======");
	}
}