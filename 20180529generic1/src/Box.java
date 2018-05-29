
public class Box {//자바의 모든 클라스를 담을 수 있다.
	private Object data;//모든 클라스는 Object로 부터 상속받는다.
	public void set(Object data) {
		this.data = data;//
	}
	public Object get() {
		return data;
	}
}
