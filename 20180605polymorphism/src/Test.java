
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");//upcasting
		Animal aCat = new Cat("����");//upcasting
		
		aDog.sing();
		//error aDog.playFetch();
		Dog gae = (Dog) aDog;
		gae.playFetch();//downcasting
		((Dog) aDog).playFetch();
		//error aDog.playFetch();
		((Dog) aDog).playFetch();//downcasting
		//error ((Cat) aDog).playFetch();//������Ÿ�� ����. ���׿��� �ִ°Ŷ� �����ȵ�!
		//aCat = new Dog("����"); �̰� �־�� �ٷ� �Ʒ� 16���� ���ư�.
		//error ((Dog) aCat).playFetch();//��Ÿ�� ����. animal �ٿ�ĳ����. ���� �𸥴� ���ư� ������. �� ���� �ְ� �ȵ� ���� ����
		//��ĳ������ �׻� ����, �ٿ�ĳ������ �׻� ������ �� �ƴ�. ���� ����ų���� �ְڱ���. ������ �Ǵ� �Ұ�.
		aCat.sing();
	}


}
