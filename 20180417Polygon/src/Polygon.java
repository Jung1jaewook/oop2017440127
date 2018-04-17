
public abstract class Polygon {//객체 만들 수 없다.
	//의미가 있다. 필드를 만들고 추상 메소드를 만들 수 있다.
	public double height;
	public double width;
	
	public abstract double area();//구현이 없다. 이 클라스를 상속받는 놈들은 이것을 구현해야 한다.
	//구현하지 않으면 그것도 추상클라스가 된다. 즉, 객체를 만들 수 없다.
}
