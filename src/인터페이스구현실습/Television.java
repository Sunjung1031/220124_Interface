package �������̽������ǽ�;

public class Television implements RemoteControl {
	// �ʵ�(�������) ����
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
		System.out.println("���� TV����:" + this.volumn);
	}

	@Override // ������
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnoOff() {
		System.out.println("TV�� ���ϴ�.");
		System.out.println(); //�ٹٲ� 
	}

}
