package 인터페이스구현실습;

import javax.security.sasl.RealmChoiceCallback;

public class MyTest {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolumn(8);
		rc.setmute(true);
		RemoteControl.changeBattery();
		rc.turnoOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolumn(5);
		rc.turnoOff();
	}

}
