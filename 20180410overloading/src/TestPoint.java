
public class TestPoint {

	public static void main(String[] args) {
		point pnt1 = new point();
    	pnt1.setX(1.0); pnt1.setY(1.0);
    	point pnt2 = new point();
    	pnt2.setX(2.0); pnt2.setY(2.0);
//		pnt1.print();//pnt�� ��ü���� this�� �ȴ�.
//		pnt2.print();//this�� �޶���.
//		String str = pnt1.toString();//��������str�� �����.
//		System.out.println(str);
		System.out.println(pnt2);//pnt1�� string�� �ƴϿ��� �˾Ƽ�toString�� �ҷ��� string�� �ǰ� ��µ�
//      System.out.println("("+pnt.getX() + ", " + pnt.getY()+")");	
		
    	System.out.println(pnt2.distance());
    	//method overloading
		System.out.println(pnt2.distance(pnt1));//�޼ҵ�� ������ �Ű������� ���� �˾Ƽ� �ҷ��´�.
		
		}

}
