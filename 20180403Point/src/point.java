
public class point {
	//�ʵ��� scope(��ȿ����)�� Ŭ���� �����̴�.
	private double x;//�ʵ�
	private double y;//private�� �ܺ� Ŭ�󽺿��� �������� ���°�.
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double xx) {
		this.x = xx;
		xx = 100.0;
	}

    public void setY(double yy) {
    	this.y = yy;
    }
	
	public double distance() {
		//��ȯ�� ���� ����
		double result;//���������� ��ȿ������ �޼ҵ� ����.
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
	}
	
	public point move(point p) { //�Ű����� p�� ��ȿ������ �޼ҵ� ����.
		
		//temp ���� ����
		double a;//���� ����
		double b;
		
		//����Ʈ p ��ŭ �̵�
		a = this.x + p.x; //x�� �ʵ�� ������ x�Դϴ� ��� ���� -> this�� ����.
		b = this.y + p.y; // this object y!
		
		//���ο� ����Ʈ ����
		point pnt = new point();
		pnt.x = a;
		pnt.y = b;
		
		//����Ʈ ��ȯ
		return pnt;
	}
}
