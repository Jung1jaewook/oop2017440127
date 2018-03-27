import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		//7. 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		int a = 1;
		int sum = 0;
		Scanner input = new Scanner(System.in);
	    
	    while(a!=0)
	    {
		    System.out.print("정수를 입력하시오: ");
		    a = input.nextInt();
		    
	    	sum = sum + a;
	    }
	    System.out.println(sum);
	}
}
