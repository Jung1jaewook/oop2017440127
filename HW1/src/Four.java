import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		System.out.println("4번 문제");
		//4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		int a;
        Scanner input = new Scanner(System.in);
		
	    System.out.print("정수(100점 이하의 점수)를 입력하시오: ");
	    a = input.nextInt();
	    
	    if(a>=80)
	    	System.out.println("등급은 A입니다.");
	    else if(a>=60)
	    	System.out.println("등급은 B입니다.");
	    else if(a>=40)
	    	System.out.println("등급은 C입니다.");
	    else if(a>=20)
	    	System.out.println("등급은 D입니다.");
	    else
	    	System.out.println("등급은 E입니다.");
	    
	    System.out.println("=====프로그램 종료=====");
	}
}