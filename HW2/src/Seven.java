import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		//7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		int a = 1;
		int sum = 0;
		Scanner input = new Scanner(System.in);
	    
	    while(a!=0)
	    {
		    System.out.print("������ �Է��Ͻÿ�: ");
		    a = input.nextInt();
		    
	    	sum = sum + a;
	    }
	    System.out.println(sum);
	}
}
