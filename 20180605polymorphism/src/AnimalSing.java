import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSing {
	List<Animal> list;//Animal�� �ڽ�Ŭ�󽺸� ���� �� �ִ�. -> ��, ����� Ŭ��(��ӹ޴¾ֵ�)���� ���� �� �ִ�. 
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	//�ϴ� ����ȯ�� �ϴ� �ñ����� ������ �޼ҵ��� �Ű������� ��� ������ �� �ִ�
	//������ ������ �ֱ⿡ �׷��ٶ�� ������ �� ��������
	void add(Animal ele) {//??????
		list.add(ele);
	}
	//void add(Cat ele); ���� �ʹ��п� 15, 16�� �Ѻ��� ����.
	//void add(Dog ele);
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing();//������ Polymorphism. Dynamic Binding
		}
	}
}
