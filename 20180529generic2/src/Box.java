public class Box <T> {
	private T data;//모든 클라스는 Object로 부터 상속받는다.
	public void set(T data) {
		this.data = data;//
	}
	public T get() {
		return data;
	}
}