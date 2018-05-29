import java.util.*;

public class Testlist {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();//업캐스팅 일종
//		LinkedList<String> list = new LinkedList<String>();/같은 표현
//		List<String> list = new ArrayList<String>(); 같은 표현
	    list.add(0, "Zero");
	    list.add("one");
	    list.add("two");
	    
	    list.add(1,"돌");//오른쪽으로 하나씩 쉬프트
	    
	    System.out.println(list);
	}

}
