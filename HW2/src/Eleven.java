import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		//10. 소수(prime-number) 검사와 흡사하게 사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.
		//8 => 2 4 
		//12 => 2 3 4 6
        //11. 위의 문제를 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
        // 위의 문제를 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
		int a;  //입력대상
		int num = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
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
			System.out.print("정수를 입력하시오: ");		
			a = input.nextInt();			
	    }
	    System.out.println("===프로그램 종료===");
	}
}
