import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//ù ��° �̺�Ʈ ������ ���� ���
public class MyListener implements ActionListener {//��ư�� �������� �̰� ����
//�׼� ������ ���� Ŭ�󽺰� �ʿ���
	@Override
	public void actionPerformed(ActionEvent e) {//ActionListener�� �ִ� �߻� �޼ҵ�
		//�׼��̺�Ʈ��ü���� ������ ��ư ��ü�� (��ư��ü�� ���۷�����) �����´�.//e���� ���� ��ư�� ��ü���� �����Ѵ�.
		JButton button = (JButton) e.getSource();//getSource���� JButton�� ������(Casting)
		//(�ֳĸ� �ټҽ��� �ٸ� ���۳�Ʈ�� ���� �� �־ casting�� �ʿ��ϴ�)	 //���� ��ư ��ü ���� ����
		button.setText("��ư�� ���������!!!");
		System.out.println("OMG ��ư�� ���������!!!!!");
	}
}