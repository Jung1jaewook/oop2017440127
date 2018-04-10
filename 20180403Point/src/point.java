
public class point {
	//필드의 scope(유효범위)은 클래스 내부이다.
	private double x;//필드
	private double y;//private는 외부 클라스에서 엑세스를 막는것.
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double xx) {
		this.x = xx;
		xx = 100.0;
	}

    public void setY(double yy) {
    	this.y = yy;
    }
	
	public double distance() {
		//반환할 변수 선언
		double result;//지역변수의 유효범위는 메소드 내부.
		
		//거리 계산
		result = Math.sqrt(x*x+y*y);
		
		//거리 반환
		return result;
	}
	
	public point move(point p) { //매개변수 p의 유효범위는 메소드 내부.
		
		//temp 변수 선언
		double a;//지역 변수
		double b;
		
		//포인트 p 만큼 이동
		a = this.x + p.x; //x는 필드로 정의한 x입니다 라고 강조 -> this로 강조.
		b = this.y + p.y; // this object y!
		
		//새로운 포인트 생성
		point pnt = new point();
		pnt.x = a;
		pnt.y = b;
		
		//포인트 반환
		return pnt;
	}
}
