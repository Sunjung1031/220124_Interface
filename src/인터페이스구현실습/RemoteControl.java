package �������̽������ǽ�;

import java.util.Set;

public interface RemoteControl {
	//������� 
    public static final int MAX_VOLUMN = 10;	//�ִ뺼��
    public static final int MIN_VOLUMN = 1;     //�ּҺ���
    
    //�߻� �޼ҵ� ����
    
    public abstract void turnOn();      		//�Ҵ�
    public abstract void turnoOff();			//����
    public abstract void setVolumn(int volumn); //�������� 
/*
 * �ڹ� 8�������ʹ� ����Ʈ �޼ҵ�� ���� �޼ҵ� ������ ����������. 
 *   => ������ ���忡�� ������ �������� ���� !!
 */
    
    default void setmute(boolean mute) {
    	if(mute) {
    		System.out.println("���� ó���մϴ�.");
    	}else {
    		System.out.println("���� �����մϴ�. ");
    	}
    }
    /*
     * ���� �޼ҵ� => ����Ʈ �޼ҵ�ʹ� �޸� ��ü�� ��� �������̽������� ȣ���� �����ϴ�. 
     */
    static void changeBattery() {
    	System.out.println("�������� ��ü�մϴ�.");
    }
}

