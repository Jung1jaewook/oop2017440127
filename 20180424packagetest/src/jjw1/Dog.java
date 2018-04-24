package jjw1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName;//접근자가 없음//package 접근지정; 패키지 내에서만 public
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField); 에러
		System.out.println(packageField);
		System.out.println(protectedField);//상속을 받지만 private이랑 똑같
	}
	
}
