import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener {
	// �ʵ�: ��� �޼ҵ忡�� ������ �� �ִ�.
	JButton button, btn;
	JTextField tf;
	MyFrame() {
	this.setSize(900,500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Jeongs event");
	
	//���ο� ���۳�Ʈ�� �����ӿ� �߰�
	this.setLayout(new FlowLayout());//�÷ο� ��ġ �Ŵ��� ���
	
	this.button = new JButton("Jeongs button");//��ư ��ü ����
	this.add(button);//��ư��ü�� �����ӿ� �߰�
	this.button.setActionCommand("button1");
	button.addActionListener(this);//�̺�Ʈ ������ ��ü ���
	
	this.btn = new JButton("�ι�° ��ư");
	this.add(btn);
	this.btn.setActionCommand("button2");
	btn.addActionListener(this);//�̺�Ʈ ������ ��ü ���
	
	tf = new JTextField(20);
	this.add(tf);
	this.setVisible(true);
	}	
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    if((e.getActionCommand()).equals("button1"))
    		this.tf.setText("ù��° ��ư");
    else
    	this.tf.setText("�ι�° ��ư");
    }
    
//	button.setText("��ư�� �ǶǶǶ� ���������!!!");
//	this.tf.setText("�ؽ�Ʈ�ʵ忡 ���� ���ڸ� �־����");
//  System.out.println("OMG ��ư�� ���������!!!!!");
	
	}