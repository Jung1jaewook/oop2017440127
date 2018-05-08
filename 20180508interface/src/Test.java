import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina = new Dog();
//		tina.eat();
//		//aaa.eat(); 수퍼 클래스에는 이트 메소드가 구현안되서 에러
		//우변 클라스가 좌변 클라스의 subclass이면 전혀 문제 없다. 좌변(superClass)<--우변(상속함 subClass) 일종의 형변환
		//Upcasting
		//Animal aaa = new Dog();//좌변 우변은 상속 관계. 14번줄과 같은 의미.(묵시적)
		Animal aaa = (Animal) new Dog();//13번줄과 같은 의미. 두 개 다 상속관계여야 한다.(명시적)
		//overriding한 메소드를 호출하면 subclass의 메소드가 수행한다.
		aaa.sing();//////----|||
		aaa = new Cat();//17번줄과 19번줄은 다형성(Polymorphism)
		aaa.sing();/////-----|||
		//다형성(polymorphism)
		//1. 하나의 클라스로부터 여러 서브클라스를 만들 경우
		//2. 모든 서브클라스는 수퍼클라스의 메소드를 override한다.
		//3. SuperClass SuperRefVar = new SubClass();
		//3. superRefVar.overrideMethod() -> 객체의 클라스가 구현한 메소드를 실행한다. 
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();//동적 바인딩(Dynamic Binding): 프로그램 수행 시 호출할 메소드를 결정한다.
		// 추상 클라스의 객체를 만들 수 없다 aaa = new Animal();
		
		int a;
		a = (int)3.1;//형변환(type casting)
		
	}
}
