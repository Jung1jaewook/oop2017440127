import javax.swing.JFrame;//JFrame�� �ȿ� ����־(Scanner�� �� import�� ����� ����)

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Jeongs frame");//â�� �̸� ��
		frame.setSize(900,500);//�ֻ��� ������Ʈ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â���� ������ ���μ��� ������.(Ŭ���̸�.---)(Static Variable[���� ����])(�빮�ڷ� �Ἥ ������ �ǹ�)
		frame.setVisible(true);//ȭ�鿡 ���.
	}

}
