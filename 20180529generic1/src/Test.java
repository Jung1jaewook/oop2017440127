
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str);//object��� StringŸ���� �־��µ� ��Ӱ��迩�� Upcasting.
		
//		String str1 = "Mr." + box.get();
		//int: primitive type /Integer: reference type
		Integer i;//Integer�� Ŭ��
		i=3;//i = new Integer(3);
		System.out.println(i);
//		i = 1 + box.get();
//		System.out.println("the box contain " + str1);
		System.out.println("the box contain " + box.get());
		int a = 10;//������Ƽ��
		box.set(a);//���۷����� ��ȯ(autoboxing)
		System.out.println(10 + (Integer)box.get());//get��ȯ���� Object
	}

}
