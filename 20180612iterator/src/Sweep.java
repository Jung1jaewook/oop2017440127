import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs;//Set은 동일한건 못넣음.
		//strs = new HashSet<>();//꺾쇄 비워도 됨.hash function의 순서대로 나온다...즉 순서를 알 수 없음
		//strs = new TreeSet<>();//순서가 달라짐. 알파벳순으로 정렬되어 저장
		strs = new LinkedHashSet<>();//입력순으로 나옴.
		//기본적 메소드 add(), remove(), sweep....
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");//해쉬함수 인덱스가 제일 낮다.
		strs.add("joonpyo");
		
		//첫번째 훑는 방법: iterator 사용
		Iterator<String> e = strs.iterator();//iterator 메소드를 부르면 이 set를 훑기 위한 iterator를 리턴해줌.
		while(e.hasNext()) {//끝까지 훑다
			String str = e.next();//하나씩 빼낸다.
			System.out.println(str);
		}
		//두번째 훑는 방법: for() 반복문 사용
		for (String str1: strs) {//for (요소타입 참조변수: 콜렉션변수) 하나씩 빼는데 요소가 String
			System.out.println(str1);
		}

	}

}
