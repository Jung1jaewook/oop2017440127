import java.util.*;

public class TestQueue {
	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>();//알파벳 순으로 저장됨.
		strs.add("trump");//queue 맨 끝에 요소를 추가
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		String str2;
		while (!strs.isEmpty()) {//for (요소타입 참조변수: 콜렉션변수)
			str2 = strs.remove();//큐 맨 앞에서 요소를 제거하여 그 요소를 반환(linkedlist의 경우)
			System.out.println(str2);
			Thread.sleep(1000);//1초마다 하나씩 나오게 함. 1초 기다려!!
		}
	}
}
