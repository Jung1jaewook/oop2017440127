
public class point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	public String toString() { //string��ü ��ȯ
		return ( "(" + this.x + ", " + this.y + ")" );//   -----toString(new double(this.x))(?)
	}
	
	public void print() {
	//	System.out.println("(" + this.getX() + ", " + this.getY() + ")");
	//	System.out.println("(" + this.x + ", " + this.y + ")");
		System.out.println("(" + getX() + ", " + getY() + ")");//this �� �ٿ�����.
		
		
	}
	

	
	public double distance() {
		return  Math.sqrt(x*x+y*y);
	}
	
	//method overloading: �޼ҵ� �̸��� ����������, �Ű������� ȣ���� �޼ҵ带 ������ �� �ִ�
	public double distance(point p) {
		return Math.sqrt( (this.x-p.getX() ) * ( this.x-p.getX() ) +
				( this.y-p.getY() ) * ( this.y-p.getY() ) );
	}

	
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;  //�ʵ� x�� �Ű����� x
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	

}