package jjw2;

import jjw1.*;//jjw1의 모든 클라스를 사용할 것이니 다 가져와라!

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; age is a private field
		
		//타 패기지의 클라스를 사용하려면
		//1. 패키지명.클라스명
		//jjw1.Dog aDog = new jjw1.Dog();
		//2. import 명령어를 사용
		Dog aDog = new Dog();
		aDog.name = "happy";
		//aDog.IDN = "23232";
   		//aDog.nickName = "kk"; nickName은 패키지 접근지정
		Animal aa = new Animal();// Animal() {로 생성자 만들면 오류남
		//aa.protectedField = "ddd"; 동일 패키지에서는 public인데 외부 패키기에서는 private 취급
		//상속은 된다.
		Rosemary rr = new Rosemary();
		rr.protectedField = 
		
	}

}
