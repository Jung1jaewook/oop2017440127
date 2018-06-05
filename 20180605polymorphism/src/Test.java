
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");//upcasting
		Animal aCat = new Cat("망고");//upcasting
		
		aDog.sing();
		//error aDog.playFetch();
		Dog gae = (Dog) aDog;
		gae.playFetch();//downcasting
		((Dog) aDog).playFetch();
		//error aDog.playFetch();
		((Dog) aDog).playFetch();//downcasting
		//error ((Cat) aDog).playFetch();//컴파일타입 에러. 도그에만 있는거라 말도안돼!
		//aCat = new Dog("해피"); 이걸 넣어야 바로 아래 16줄이 돌아감.
		//error ((Dog) aCat).playFetch();//런타임 에러. animal 다운캐스팅. 아직 모른다 돌아갈 때까지. 될 수도 있고 안될 수도 있음
		//업캐스팅은 항상 가능, 다운캐스팅은 항상 가능한 건 아님. 개를 가리킬수도 있겠구나. 지금은 판단 불가.
		aCat.sing();
	}


}
