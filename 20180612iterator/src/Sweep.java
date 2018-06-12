import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs;//Set�� �����Ѱ� ������.
		//strs = new HashSet<>();//���� ����� ��.hash function�� ������� ���´�...�� ������ �� �� ����
		//strs = new TreeSet<>();//������ �޶���. ���ĺ������� ���ĵǾ� ����
		strs = new LinkedHashSet<>();//�Է¼����� ����.
		//�⺻�� �޼ҵ� add(), remove(), sweep....
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");//�ؽ��Լ� �ε����� ���� ����.
		strs.add("joonpyo");
		
		//ù��° �ȴ� ���: iterator ���
		Iterator<String> e = strs.iterator();//iterator �޼ҵ带 �θ��� �� set�� �ȱ� ���� iterator�� ��������.
		while(e.hasNext()) {//������ �ȴ�
			String str = e.next();//�ϳ��� ������.
			System.out.println(str);
		}
		//�ι�° �ȴ� ���: for() �ݺ��� ���
		for (String str1: strs) {//for (���Ÿ�� ��������: �ݷ��Ǻ���) �ϳ��� ���µ� ��Ұ� String
			System.out.println(str1);
		}

	}

}
