package chapter_5;
// 인터페이스 : 클래스가 구현해야 할 메소드들이 선언되는 추상형. interface 키워드로 선언한다
// 인터페이스에는 필드(멤버 변수) 선언불가!
/* 구성요소 - 1. 상수 : public만 허용하며, public static final은 생략 가능하다
 *			2. 추상 메소드 : public abstract 생략 가능하다
 *			3. default 메소드 : 인터페이스에 코드가 구현된 메소드. 인터페이스 구현 클래스에 자동 상속되며, public 접근 지정만 허용되고 생략 가능
 *			4. private 메소드 : 인터페이스 내에 메소드 코드가 작성되어야하며, 인터페이스 내의 다른 메소드에 의해서만 호출된다
 *			5. static 메소드 : public, private 모두 지정 가능, 생략할 경우 public
*/
// 인터페이스 객체는 생성할 수 없지만, 인터페이스 타입의 레퍼런스 변수 선언은 가능하다. 
// 인터페이스의 구현 - 인터페이스를 상속받는 클래스는 인터페이스의 모든 추상메소드를 반드시 구현해야한다.
// 다른 인터페이스를 상속할 수도, 다중상속할 수도 있다.



interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	default void printLogo() { // default 메소드
		System.out.println("** Phone **");
	}
}
// 클래스는 오버라이딩 해도, 안해도 되지만 인터페이스는 무조건 해야한다!


class SamsungPhone implements PhoneInterface { // 인터페이스 구현
	// PhoneInterface의 모든 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	// 새로운 메소드 추가로 작성 
	public void flash() { System.out.println("전화기에 불이 켜졌습니다."); }
}


interface MobilePhoneInterface extends PhoneInterface{
	// 인터페이스를 상속받는 인터페이스 
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	// 새로운 인터페이스 
	void play();
	void stop();
}

interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface{
	// 인터페이스를 다중상속받는 인터페이스 
	
	void playMP3RingTone();
}

class PDA { // 클래스 작성
	public int calculate(int x, int y) {
		return x + y;
	}
}
// SmartPhone 클래스는 PDA를 상속받고,
// MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 추상 메소드를 모두 구현한다.
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	// MobilePhoneInterface의 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요.");
	}
	// MP3Interface의 추상 메소드 구현
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	// 추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

public class Phone_practice {
	
	public static void main(String [] args) {
	SmartPhone phone = new SmartPhone();
	phone.printLogo();
	phone.sendCall();
	phone.play();
	System.out.println("3과 5를 더하면 " +
		 phone.calculate(3,5));
	phone.schedule();
	}
}


	