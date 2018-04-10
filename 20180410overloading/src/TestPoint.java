
public class TestPoint {

	public static void main(String[] args) {
		point pnt1 = new point();
    	pnt1.setX(1.0); pnt1.setY(1.0);
    	point pnt2 = new point();
    	pnt2.setX(2.0); pnt2.setY(2.0);
//		pnt1.print();//pnt가 객체여서 this가 된다.
//		pnt2.print();//this가 달라짐.
//		String str = pnt1.toString();//참조변수str에 저장됨.
//		System.out.println(str);
		System.out.println(pnt2);//pnt1이 string이 아니여서 알아서toString을 불러서 string이 되고 출력됨
//      System.out.println("("+pnt.getX() + ", " + pnt.getY()+")");	
		
    	System.out.println(pnt2.distance());
    	//method overloading
		System.out.println(pnt2.distance(pnt1));//메소드는 같은데 매개변수에 따라 알아서 불러온다.
		
		}

}
