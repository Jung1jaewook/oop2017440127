
public class Test {

	public static void main(String[] args) {
		Drivable a = new Car();
		System.out.println(a.brake());
		System.out.println(a.acc());
		
		Drivable b = new Bicycle();
		System.out.println(b.brake());
		System.out.println(b.acc());

	}

}
