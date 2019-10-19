interface PhoneInterface{
	int TIMEOUT = 10000; // 상수. final 생략한 것
	void sendCall(); // 추상메소드. abstract 생략
	void receiveCall(); // 추상메소드.
	default void printLogo() {
		System.out.println("**Phone**"); // 디폴트 메소드 
	}
}

interface MobilePhone extends PhoneInterface{ // 다른 인터페이스를 상속받는 인터페이스 
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{  // 또다른 인터페이스 
	void play(); 
	void stop();
}

interface MusicPhone extends MobilePhone, MP3Interface{ // 인터페이스 다중상속 
	void playMP3_Ring();
}


class SamsungPhone implements PhoneInterface, MP3Interface{
	public void sendCall() {
		System.out.println("띠링띠");
	}
	public void receiveCall() {
		System.out.println("전화왔습니다 ");
	}
	
	public void flash() {
		System.out.println("불이 켜졌습니다. ");
	}
	
	public void printLogo() {
		System.out.println("어서오세요."); // 인터페이스의 default 오버라이딩
	}
	
	public void play() {
		System.out.println("노래 재생");
	}
	
	public void stop() {
		System.out.println("노래 멈춤");
	}
	
}

public class interface2{
	public static void main(String[] args) {
	SamsungPhone galaxy = new SamsungPhone();
	
	galaxy.printLogo();
	galaxy.sendCall();
	galaxy.receiveCall();
	galaxy.flash();
	
	}
}
 