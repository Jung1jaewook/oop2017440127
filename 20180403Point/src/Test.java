
public class Test {

	public static void main(String[] args) {
		
		point p;
		p = new point(); //포인트 객체 생성 및 레퍼런스  p에 저장
		
		//객체의 필드 접근
//		p.x = 1.0;// 포인트 내부 필드 x
//		p.y = 1.0;//public 쓸때 사용.
		
		
		double temp = 1.0;
		
		p.setX(temp);//접근자를 사용한 필드 설정
		System.out.println("temp=" + temp);
		
		p.setY(temp);;//설정자. 1.0넣어도 됨
		
//		System.out.println(p.getX());//접근자
//		System.out.println(p.distance());//p 객체의 distance() 함수 호출
	}
}
//함수호출 시 
//1. 매개변수를 복사하기 위해 메모리 영역이 새로 생성된다.
//2. 매개변수의 값이 새로 생성된 메모리 영역으로 복사된다.
//3. 함수 내에서는 새로 생성된 메모리영역을 접근한다.
//4. 함수가 종료되면 생성된 메모리 영역이 소멸된다
//c 12 메모리 접근, 요약화, 구조체에 정리됨.