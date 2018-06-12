import java.util.*;

public class Testmap {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>();//Ű�� ���ĺ� ����
		Map<String, String> map = new LinkedHashMap<>();//���� ����
		//�߰�: .put(key, value) valueã��: value = .get(key)
		map.put("���̴�", "û�ʹ�");
		map.put("Ʈ����", "��ǰ�");
		map.put("������", "�Ǿ�");
		
		System.out.println(map.get("���̴�"));//key�� valueã��
		
		//��ó: http://stove99.tistory.com/96 [����� Ȧ�α�]
		// �ȴ� ���1: Ű���� ����� �� Ű���� iterator ���
		//Iterator<String> itr = map.keySet().iterator();//17, 18���� ����
		Set<String> set = map.keySet();//map.set(): map�� ����� ��Ʈ��(Ű,��) �� Ű�� ���� ��.
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {//������ �ȴ�
			String key = itr.next();
			System.out.println( String.format("Ű: %s, ��: %s", key, map.get(key)) );
		}
		//�ȴ� ���2: Ű���� ����� for()�ݺ��� ���
		for ( String key : map.keySet() ) {//Ű�¿��� �ϳ��� ��!
			System.out.println( String.format("Ű: %s, ��: %s", key, map.get(key)) );
		}
		
		//�ȴ� ���3: ��Ʈ������ ����� ���
		for( Map.Entry<String, String> elem : map.entrySet() ) {
			System.out.println( String.format("Ű: %s, ��: %s", elem.getKey(), elem.getValue()) );
		}
	
	}

}
