package chapter_5;

//메소드 오버라이딩을 활용한 예제 

class Weapon {
	protected int fire() {
		return 1; 
		// weapon은 기본적으로 한 명만 살상 
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() { // Weapon의 메소드를 오버라이딩
		return 10; // Cannon은 한 번에 10명을 살상
	}
}


public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " + weapon.fire());
	}

}
