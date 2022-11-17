package CellPhone;

public class DmbCellPhone extends CellPhone { // B 자식
	int channel;

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("channel " + channel + "번 A 방송 수신 시작");

	}

	void changeChannelDmb(int channel) {
		System.out.println("channel " + channel + "번으로 변경");

	}

	void turnOffDmb() {
		System.out.println("A 방송 수신 종료");

	}
}
