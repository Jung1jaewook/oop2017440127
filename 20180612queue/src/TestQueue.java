import java.util.*;

public class TestQueue {
	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>();//���ĺ� ������ �����.
		strs.add("trump");//queue �� ���� ��Ҹ� �߰�
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		String str2;
		while (!strs.isEmpty()) {//for (���Ÿ�� ��������: �ݷ��Ǻ���)
			str2 = strs.remove();//ť �� �տ��� ��Ҹ� �����Ͽ� �� ��Ҹ� ��ȯ(linkedlist�� ���)
			System.out.println(str2);
			Thread.sleep(1000);//1�ʸ��� �ϳ��� ������ ��. 1�� ��ٷ�!!
		}
	}
}
