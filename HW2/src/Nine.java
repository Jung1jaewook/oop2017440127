import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		//1부터 9사이의 숫자 하나를 입력 받아 그 숫자의 구구단을 출력하는 프로그램을 작성하시오.(5이면 5단을 출력)
		// 9. 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 
		//이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 
		//다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)

		int dan=0;
		int num = 1;
		int result;
		
		Scanner input = new Scanner(System.in);
	    System.out.print("단(자연수)를 입력하시오: ");
	    dan = input.nextInt();
	    while(dan>=1) {
	    	while(dan>9)
	    	{
	    		System.out.println("1이상 9이하의 정수를 입력해주세요!");
	    	    System.out.print("단을 입력하시오: ");
	    	    dan = input.nextInt();
	    	}

	    	while(num<=9)
	    {
	    	result = dan*num;
	    	System.out.println(dan + "X" +  + num + "=" + result);
	    	num++;
	    	}
	    }
	}
}
