import javax.swing.JFrame;//JFrame이 안에 들어있어서(Scanner쓸 때 import와 비슷한 개념)

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Jeongs frame");//창에 이름 뜸
		frame.setSize(900,500);//최상위 컴포넌트
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창문을 닫으면 프로세스 끝내라.(클라스이름.---)(Static Variable[정적 변수])(대문자로 써서 상수라는 의미)
		frame.setVisible(true);//화면에 띤다.
	}

}
