
public class Car {
	//Fields
	private String color;
	private int speed;
	
	public static int numberofCars = 0;//���� ����(Static field) -- Ŭ�� ����. Ŭ�󽺿� �� �Ѱ������� �ִ� ��.��Ÿƽ ����
	//Constructor (������): �޼ҵ���� Ŭ�� �̸��� ����. ��ȯ���� ����.
	//���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� �������ش�.
	//������, �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ��ϵ� ���Ѵ�.
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
	public static void print() {//�����޼ҵ�� ��ü�� ������ �ȵȴ�. ��� ����...
		//���� �޼ҵ�� ���� ������ ������ �� �ִ�.
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
