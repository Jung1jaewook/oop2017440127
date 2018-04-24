package jjw1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.print();
		tina.name = "tina";
		//tina.IDN = "30942394"; Error IDN is a private field
		tina.nickName = "tt";
		tina.publicField = "U2"; //tina.privateField = "St"; 에러 private는 상속 x
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";
	}

}
