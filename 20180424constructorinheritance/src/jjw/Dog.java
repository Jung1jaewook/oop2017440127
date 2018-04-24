package jjw;

public class Dog extends Animal {
	public Dog() {//디폴트 생성자/ 디폴트 돌기 전 패런트의 디폴트가 먼저 돌아감. 묵시적
		//명시적 슈퍼클라스의 생성자 호출 super();//explicitly적으로 parent의 생성자 돌림
		System.out.println("Dog 디폴트 생성자");
	}//이 생성자는 Dog의 특별한 성질만 관리. //overriding은 sub만 돌림
	public Dog(int a) {//디폴트 아님
		super(a);//명시적만 가능. 묵시적으로 하면 디폴트 생성자를 불러옴
		System.out.println("Dog 정수형 생성자");
	}
	
}
