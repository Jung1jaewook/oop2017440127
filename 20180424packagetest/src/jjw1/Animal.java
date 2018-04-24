package jjw1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;//public(?)
	
	//protected: ��Ű�� ���ο� ������� ��ӵ�
	// ���� ��Ű�� �������� public
	// Ÿ ��Ű�������� private 
	protected String protectedField;
	
	public Animal() { //Aniamal�� �ϸ� Test���� ����
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}
