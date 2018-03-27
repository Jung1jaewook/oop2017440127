import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		//사용자 입력 : 한 개의 두 자리 정수
		//출력 : 자릿수의 순서가 반대로 된 정수
		System.out.println("6번 문제");
		int a;
		int b;
		int c;
        Scanner input = new Scanner(System.in);
		
	    System.out.print("두 자리수의 정수를 입력하시오: ");
	    a = input.nextInt();
	    b = a/10;
	    c = a%10;
	    
	    if(a>=100)
	    	System.out.println("두 자리수의 정수를 입력해주세요!");
	    else if(a>=10) {
	    	a = c*10 + b;
	    	System.out.println("바뀐 두자리수의 정수: " + a);
	    }
	    else 
	    	System.out.println("두 자리수의 정수를 입력해주세요!");
	    System.out.println("===========프로그램 종료============");
	}

}
