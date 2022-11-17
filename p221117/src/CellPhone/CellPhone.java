package CellPhone;	

public class CellPhone {		//A 부모 
	String model;
	String color;

	void powerOn() {
		System.out.println("Power On");
	}

	void powerOff() {
		System.out.println("Power Off");
	}

	void bell() {
		System.out.println("Bell ring");
	}

	void sendVoice(String messge) {
		System.out.println("sendVoice :" + messge);
	}

	void receiveVoice(String messge) {
		System.out.println("Receive Message : " + messge);
	}

	void hangUp() {
		System.out.println("Hang Up");
	}

}