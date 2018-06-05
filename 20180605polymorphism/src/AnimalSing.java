import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSing {
	List<Animal> list;//Animal의 자식클라스를 가질 수 있다. -> 개, 고양이 클라스(상속받는애들)까지 넣을 수 있다. 
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing();//굉장한 Polymorphism. Dynamic Binding
		}
	}
}
