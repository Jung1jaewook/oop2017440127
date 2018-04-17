
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0));//Math,cos() 객체를 생성하지 않고 사용할 수 있는 메소드.......static method
		Car myCar = new Car("Space Blue", 300);
		Car.print();
		System.out.println(myCar.numberofCars);//객체변수.의 필드
		Car yourCar = new Car();
		System.out.println(yourCar.numberofCars);
		//정적 변수는 "클라스명.정적변수명"으로도 접근할 수 있다.
		System.out.println(Car.numberofCars);
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
		System.out.println(myCar);

	}

}
