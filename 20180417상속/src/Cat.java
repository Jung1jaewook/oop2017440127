
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	@Override //나 이거 overriding하는 거야... 틀린거 안내메세지 나타낸다.
	public void sing() {//(string ss)넣으면 오류.
		System.out.println(name + " 야옹");
	}

}
