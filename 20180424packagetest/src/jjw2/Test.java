package jjw2;

import jjw1.*;//jjw1�� ��� Ŭ�󽺸� ����� ���̴� �� �����Ͷ�!

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		//aBasil.age = 2; age is a private field
		
		//Ÿ �б����� Ŭ�󽺸� ����Ϸ���
		//1. ��Ű����.Ŭ�󽺸�
		//jjw1.Dog aDog = new jjw1.Dog();
		//2. import ��ɾ ���
		Dog aDog = new Dog();
		aDog.name = "happy";
		//aDog.IDN = "23232";
   		//aDog.nickName = "kk"; nickName�� ��Ű�� ��������
		Animal aa = new Animal();// Animal() {�� ������ ����� ������
		//aa.protectedField = "ddd"; ���� ��Ű�������� public�ε� �ܺ� ��Ű�⿡���� private ���
		//����� �ȴ�.
		Rosemary rr = new Rosemary();
		rr.protectedField = 
		
	}

}
