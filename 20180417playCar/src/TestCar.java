
public class TestCar {

	public static void main(String[] args) {
		System.out.println(Math.cos(0));//Math,cos() ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�.......static method
		Car myCar = new Car("Space Blue", 300);
		Car.print();
		System.out.println(myCar.numberofCars);//��ü����.�� �ʵ�
		Car yourCar = new Car();
		System.out.println(yourCar.numberofCars);
		//���� ������ "Ŭ�󽺸�.����������"���ε� ������ �� �ִ�.
		System.out.println(Car.numberofCars);
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
		System.out.println(myCar);

	}

}
