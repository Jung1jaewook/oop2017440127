import java.util.Scanner;

public class Twentyone {

	public static void main(String[] args) {
		// 21.사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		int i;
		int number;
		int sum = 0;
		int a;

		System.out.print("숫자를 입력하세요: ");
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
		System.out.println(number + "이하의 소수들의 합은 " + sum + "입니다.");
	}
}
