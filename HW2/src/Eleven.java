import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		//10. �Ҽ�(prime-number) �˻�� �����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//8 => 2 4 
		//12 => 2 3 4 6
        //11. ���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
        // ���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		int a;  //�Է´��
		int num = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		while(a!=0)
		{
			num = 2;
			while(num<a)
			{		
				if(a%num==0)
				System.out.println(num);			
				num++;
			}
			System.out.print("������ �Է��Ͻÿ�: ");		
			a = input.nextInt();			
	    }
	    System.out.println("===���α׷� ����===");
	}
}