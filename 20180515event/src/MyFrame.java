import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener {//두번째 이벤트 리스너 구현 방법
	// 필드: 모든 메소드에서 접근할 수 있다.(중요)
	JButton button, btn;//local Variable
	JTextField tf;
	MyFrame() {//Constructor
	this.setSize(900,500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Jeongs event");
	
	//새로운 컴퍼넌트를 프레임에 추가
	this.setLayout(new FlowLayout());//플로우 배치 매니저 사용
	
	this.button = new JButton("Jeongs button");//버튼 객체 생성
	this.add(button);//버튼객체를 프레임에 추가
	this.button.setActionCommand("button1");
	button.addActionListener(this);//이벤트 리스터 객체 등록
	
	this.btn = new JButton("두번째 버튼");
	this.add(btn);
	this.btn.setActionCommand("button2");//버튼1,2에 똑같은 액션이 처리된다. 리스너는 같다.
	btn.addActionListener(this);//이벤트 리스터 객체 등록
	
	tf = new JTextField(20);
	this.add(tf);
	this.setVisible(true);
	}	
    @Override//두번째 이벤트 리스너 구현 방법 --> MyListener클라스 필요없어짐. 객체를 바꿔줘야 한다. this로 바꿔줌
    public void actionPerformed(ActionEvent e) {
    	
    if((e.getActionCommand()).equals("button1"))
    		this.tf.setText("첫번째 버튼");
    else
    	this.tf.setText("두번째 버튼");
    }//버튼 여러개일때 어떤 버튼이 눌러졌느냐는 각 버튼마다 셋액션커멘드해서 어떤 스트링을 집어넣는다.
    
//	button.setText("버튼이 또또또또 눌러졌어요!!!");
//	this.tf.setText("텍스트필드에 마구 글자를 넣었어요");//필드는 모든 메소드에서 접근 가능.easy
//  System.out.println("OMG 버튼이 눌러졌어요!!!!!");
//  }
}