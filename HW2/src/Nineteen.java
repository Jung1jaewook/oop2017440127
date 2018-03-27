import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		int i;
		int number;

		System.out.print("숫자를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		for(i=2;i<number;i++) {
			if(number%i==0) 
				break;
		}
		if(i==number)
			System.out.println(number + "은 소수입니다.");
		else
			System.out.println(number + "은 소수가 아닙니다.");
	}

}
