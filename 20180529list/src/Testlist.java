import java.util.*;

public class Testlist {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();//��ĳ���� ����
//		LinkedList<String> list = new LinkedList<String>();/���� ǥ��
//		List<String> list = new ArrayList<String>(); ���� ǥ��
	    list.add(0, "Zero");
	    list.add("one");
	    list.add("two");
	    
	    list.add(1,"��");//���������� �ϳ��� ����Ʈ
	    
	    System.out.println(list);
	}

}
