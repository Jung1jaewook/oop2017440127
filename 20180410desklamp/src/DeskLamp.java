
public class DeskLamp {
  //�ʵ�
	private boolean isOn;
	
  //�޼ҵ�
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
		if (isOn) {
			return "�����ֽ��ϴ�";
		}
		else {
			return "�����ֽ��ϴ�";
		}
	}
}
