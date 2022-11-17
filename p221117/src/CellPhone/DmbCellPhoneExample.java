package CellPhone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone DmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		System.out.println("model : " + DmbCellPhone.model);
		System.out.println("color : " + DmbCellPhone.color);

		System.out.println("channel : " + DmbCellPhone.channel);

		DmbCellPhone.powerOn();
		DmbCellPhone.bell();
		DmbCellPhone.sendVoice("여보세요?");
		DmbCellPhone.receiveVoice("안녕하세요. 홍길동입니다.");
		DmbCellPhone.sendVoice("네, 반갑습니다.");
		DmbCellPhone.hangUp();

		DmbCellPhone.turnOnDmb();
		DmbCellPhone.changeChannelDmb(12);
		DmbCellPhone.turnOffDmb();
	}

}
