import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calculator extends JFrame implements ActionListener{
	//필드
	int oldnum, temp, result;
	String tempFun, tempinput = "";
	boolean finish = false;
	JButton button0, button1, button2, button3, button4, button5, button6,
	        button7, button8, button9, button10, button11, button12;
	JTextField tf1;
	
	Calculator() {
		this.setSize(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		//새로운 컴퍼넌트를 프레임에 추가
		this.setLayout(new FlowLayout());
		
		tf1 = new JTextField(15);
		this.add(tf1);
		
		this.button0 = new JButton("0");
		this.add(button0);
		this.button0.setActionCommand("0");
		button0.addActionListener(this);
		
		this.button1 = new JButton("1");
		this.add(button1);
		this.button1.setActionCommand("1");
		button1.addActionListener(this);
		
		this.button2 = new JButton("2");
		this.add(button2);
		this.button2.setActionCommand("2");
		button2.addActionListener(this);
		
		this.button3 = new JButton("3");
		this.add(button3);
		this.button3.setActionCommand("3");
		button3.addActionListener(this);
		
		this.button4 = new JButton("4");
		this.add(button4);
		this.button4.setActionCommand("4");
		button4.addActionListener(this);
		
		this.button5 = new JButton("5");
		this.add(button5);
		this.button5.setActionCommand("5");
		button5.addActionListener(this);
		
		this.button6 = new JButton("6");
		this.add(button6);
		this.button6.setActionCommand("6");
		button6.addActionListener(this);
		
		this.button7 = new JButton("7");
		this.add(button7);
		this.button7.setActionCommand("7");
		button7.addActionListener(this);
		
		this.button8 = new JButton("8");
		this.add(button8);
		this.button8.setActionCommand("8");
		button8.addActionListener(this);
		
		this.button9 = new JButton("9");
		this.add(button9);
		this.button9.setActionCommand("9");
		button9.addActionListener(this);
		
		this.button10 = new JButton("+");
		this.add(button10);
		this.button10.setActionCommand("+");
		button10.addActionListener(this);
		
		this.button11 = new JButton("=");
		this.add(button11);
		this.button11.setActionCommand("=");
		button11.addActionListener(this);
		
		this.button12 = new JButton("C");
		this.add(button12);
		this.button12.setActionCommand("C");
		button12.addActionListener(this);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		
		if(input.equals("+")) {
    	oldnum = temp;
		tempFun = "+";
		tempinput = "";
		}
		
		else if (input.equals("C")) {
    	tempinput = "";
    	temp = 0;
    	oldnum = 0;
    	tf1.setText("");
    	}
		
		else if (input.equals("=")) {
			if(tempFun.equals("+")) {
    		result = oldnum + temp;
    		tf1.setText(String.valueOf(result));
    		finish = true;
    		}
			}
		
		else {
			if(finish) {
				tf1.setText("0");
				finish = false;
				temp = 0;
				oldnum = 0;
				tempinput = "";
				}
			
			tempinput += e.getActionCommand();
//			System.out.println(tempinput);
			tf1.setText(tempinput);
			temp = Integer.parseInt(tempinput);
		}
	}
}
