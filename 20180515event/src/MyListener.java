import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//첫 번째 이벤트 리스터 구현 방법
public class MyListener implements ActionListener {//버튼이 눌러지면 이게 실행

	@Override
	public void actionPerformed(ActionEvent e) {//ActionListener에 있는 추상 메소드
		//액션이벤트객체에서 눌려진 버튼 객체를 (버튼객체의 레퍼런스값) 가져온다.//e에는 누른 버튼의 객체값도 존재한다.
		JButton button = (JButton) e.getSource();//getSource에서 JButton만 가져옴(Casting)		
		button.setText("버튼이 눌러졌어요!!!");
		System.out.println("OMG 버튼이 눌러졌어요!!!!!");
	}
}