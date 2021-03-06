package 인터페이스구현실습;

public class Television implements RemoteControl {
	// 필드(멤버변수) 선언
	private int volumn;

	@Override
	public void setVolumn(int volumn) {
		if (volumn > MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		} else if (volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		} else {
			this.volumn = volumn;
		}
		System.out.println("현재 TV볼륨:" + this.volumn);
	}

	@Override // 재정의
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnoOff() {
		System.out.println("TV를 끕니다.");
		System.out.println(); //줄바꿈 
	}

}
