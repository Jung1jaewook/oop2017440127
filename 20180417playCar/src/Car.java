
public class Car {
	//Fields
	private String color;
	private int speed;
	
	public static int numberofCars = 0;//정적 변수(Static field) -- 클라스 변수. 클라스에 딱 한공간에만 있는 것.스타틱 변수
	//Constructor (생성자): 메소드명이 클라스 이름과 같다. 반환형이 없다.
	//만약 생성자를 정의하지 않으면 매개변수 없는 생성자를 자바에서 자동으로 생성해준다.
	//하지만, 생성자를 하나라도 정의하면 자바는 아무일도 안한다.
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		numberofCars++;
	}
	
	public Car() {
		this.color = "White";
		this.speed = 60;
		numberofCars++;
	}
	
	//methods
	public static void print() {//정적메소드는 객체에 접근이 안된다. 고로 오류...
		//정적 메소드는 정적 변수만 접근할 수 있다.
//		System.out.println(this.color + "," +  this.speed);  error
		System.out.println(numberofCars);
	}
	
	
	public String toString() {
		return ("Color is" + this.color + ". Speed is " + this.speed);
	}
	
 	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
