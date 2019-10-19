import java.util.Scanner;

class Weapon{
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon{
	protected int fire() {
		
		// super 키워드 사용
		System.out.println("cannon의 살상능력" + super.fire());
		
		return 10;
	}
	

}

public class method_overriding{
	
	public static void main(String[] args) {
		
		Weapon weapon = new Weapon();
		System.out.println("weapon의 살상능력" + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("cannon의 살상능력" + weapon.fire());

	}
	
}