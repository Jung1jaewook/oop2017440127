
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str);//object대신 String타입을 넣었는데 상속관계여서 Upcasting.
		
//		String str1 = "Mr." + box.get();
		//int: primitive type /Integer: reference type
		Integer i;//Integer은 클라스
		i=3;//i = new Integer(3);
		System.out.println(i);
//		i = 1 + box.get();
//		System.out.println("the box contain " + str1);
		System.out.println("the box contain " + box.get());
		int a = 10;//프리미티브
		box.set(a);//레퍼런스로 변환(autoboxing)
		System.out.println(10 + (Integer)box.get());//get반환형은 Object
	}

}
