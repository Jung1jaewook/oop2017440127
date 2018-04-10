
public class point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	public String toString() { //string객체 반환
		return ( "(" + this.x + ", " + this.y + ")" );//   -----toString(new double(this.x))(?)
	}
	
	public void print() {
	//	System.out.println("(" + this.getX() + ", " + this.getY() + ")");
	//	System.out.println("(" + this.x + ", " + this.y + ")");
		System.out.println("(" + getX() + ", " + getY() + ")");//this 안 붙여도됨.
		
		
	}
	

	
	public double distance() {
		return  Math.sqrt(x*x+y*y);
	}
	
	//method overloading: 메소드 이름은 동일하지만, 매개변수로 호출할 메소드를 구분할 수 있다
	public double distance(point p) {
		return Math.sqrt( (this.x-p.getX() ) * ( this.x-p.getX() ) +
				( this.y-p.getY() ) * ( this.y-p.getY() ) );
	}

	
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;  //필드 x는 매개변수 x
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	

}