import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("2번 문제");
        //2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		int a;
		int num;
		Scanner input = new Scanner(System.in);
	    System.out.print("하나의 정수를 입력하시오: ");
	    a = input.nextInt();
	    num = a%2; 
	    if(num==0)
	    	System.out.println("이 숫자는 짝수입니다.");
	    else
	    	System.out.println("이 숫자는 홀수입니다.");
		System.out.println("=======프로그램 종료=======");
	}
}