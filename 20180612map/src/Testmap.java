import java.util.*;

public class Testmap {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>();//키의 알파벳 순서
		Map<String, String> map = new LinkedHashMap<>();//넣은 순서
		//추가: .put(key, value) value찾기: value = .get(key)
		map.put("재이니", "청와대");
		map.put("트럼프", "백악관");
		map.put("정으니", "피양");
		
		System.out.println(map.get("재이니"));//key로 value찾기
		
		//출처: http://stove99.tistory.com/96 [스토브 홀로구]
		// 훑는 방법1: 키셋을 만들어 이 키셋의 iterator 사용
		//Iterator<String> itr = map.keySet().iterator();//17, 18줄을 함축
		Set<String> set = map.keySet();//map.set(): map에 저장된 엔트리(키,값) 중 키만 모은 셋.
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {//끝까지 훑다
			String key = itr.next();
			System.out.println( String.format("키: %s, 값: %s", key, map.get(key)) );
		}
		//훑는 방법2: 키셋을 만들어 for()반복문 사용
		for ( String key : map.keySet() ) {//키셋에서 하나씩 배!
			System.out.println( String.format("키: %s, 값: %s", key, map.get(key)) );
		}
		
		//훑는 방법3: 엔트리셋을 만드는 방법
		for( Map.Entry<String, String> elem : map.entrySet() ) {
			System.out.println( String.format("키: %s, 값: %s", elem.getKey(), elem.getValue()) );
		}
	
	}

}
