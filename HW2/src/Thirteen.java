import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		// 13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) //1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		int month, day;
		System.out.print("month를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		
		System.out.print("day를 입력하세요: ");
		day = input.nextInt();
		
		switch(month-1) {
		case 11:
			day+=30;
		case 10:
			day+=31;
		case 9:
			day+=30;
		case 8:
			day+=31;
		case 7:
			day+=31;
		case 6:
			day+=30;
		case 5:
			day+=31;
		case 4:
			day+=30;
		case 3:
			day+=31;
		case 2:
			day+=28;
		case 1:
			day+=31;
		}
		System.out.println("1월 1일부터의 총 day수는 " + day + "일입니다.");
		System.out.println("===========프로그램 종료============");
	}
}
