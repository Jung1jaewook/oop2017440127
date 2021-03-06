
public class Loop {

	public static void main(String[] args) {
		//1~10 정수를 화면에 출력
		int i;//i는 루프변수
		i = 1;//                        1. 루프변수 초기화
		while(i<=10) { //               2.루프 조건식
			System.out.println(i);  //  3.루프문
			i++;//                      4.루프변수 변화
		}
		//위의 while문을 for문으로 반환
		for(i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		int sum = 0;   //1~10까지의 합을 출력문제
		i = 1;//                        1. 루프변수 초기화
		while(i<=10) { //               2.루프 조건식
			sum += i;  //               3.루프문
			i++;//                      4.루프변수 변화
		}
		System.out.println("sum = " + sum);
		
		//문장에서 l의 갯수 구하기
		String str = "hello darkness my old friend";
		int count = 0;
		for(i=0; i < str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견한 l의 갯수" + count);
		
		System.out.println("===========프로그램 종료============");
	}
}