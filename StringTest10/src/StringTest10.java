
public class StringTest10 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("-----");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("-----");
		
		// 19. intern() : 내용이 같은 인스턴스를 하나의 인스턴스를 참조하도록 만들어주는 메소드
		s1 = s1.intern();
		s2 = s2.intern();
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		// 20. String.format() : 문자열을 포멧에 맞춰 생성해 주는 메소드
		
	}
}
