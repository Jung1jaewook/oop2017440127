
public class Stringtest {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		str1 = str2;
		System.out.println(str1==str2);//전화번호 값이 달라짐.
	}
}
//함수를 사용하기 위해 필요한 아래의 정보를 표현한다.
//1.함수이름을 지정한다.
//2.함수의 반환형을 지정한다.
//3.매개변수의 개수를 정한다.
//4.각 매개변수의 자료형을 지정한다.
//함수를 사용하려면 미리 함수선언을 해야 한다.