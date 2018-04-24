package jjw1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;//public(?)
	
	//protected: 패키지 여부와 상관없이 상속됨
	// 동일 패키지 내에서는 public
	// 타 패키지에서는 private 
	protected String protectedField;
	
	public Animal() { //Aniamal로 하면 Test에선 오류
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}
