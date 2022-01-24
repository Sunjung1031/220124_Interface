package 인터페이스구현실습;

import java.util.Set;

public interface RemoteControl {
	//상수선언 
    public static final int MAX_VOLUMN = 10;	//최대볼륨
    public static final int MIN_VOLUMN = 1;     //최소볼륨
    
    //추상 메소드 선언
    
    public abstract void turnOn();      		//켠다
    public abstract void turnoOff();			//끈다
    public abstract void setVolumn(int volumn); //볼륨조절 
/*
 * 자바 8버전부터는 디폴트 메소드와 정석 메소드 선언이 가능해졌다. 
 *   => 개발자 입장에서 개발의 유연성이 생김 !!
 */
    
    default void setmute(boolean mute) {
    	if(mute) {
    		System.out.println("무음 처리합니다.");
    	}else {
    		System.out.println("무음 해제합니다. ");
    	}
    }
    /*
     * 정적 메소드 => 디폴트 메소드와는 달리 객체가 없어도 인터페이스만으로 호출이 가능하다. 
     */
    static void changeBattery() {
    	System.out.println("건전지를 교체합니다.");
    }
}

