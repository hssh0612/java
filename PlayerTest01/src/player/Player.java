package player;
/*
 < 인터페이스 >
 1. 인터페이스 안의 메소드는 오직 추상 메소드만을 갖는다.
 2. 인터페이스 안의 추상 메소드는 public과 abstract를 생략할 수 있다.
 3. 인터페이스는 인스턴스를 생성할 수 없다.
 4. 인터페이스는 다형성의 구현을 위해서 사용한다.
 */
public interface Player {
	
	//public abstract void play();
	//public void play();
	//abstract void play();
	void play();
	
	
	//public abstract void stop();
	void stop();
}
