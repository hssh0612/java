// 문제2) 로또 번호 6개를 저장하는 lotto 배열을 만들어, 랜덤으로 6개의 로또 번호를 저장하고,
// 오름차순으로 정렬하여 출력하시오.
// 중복 번호가 발생하지 않도록 하시오.
// Math.random?


public class ArrayTest02 {
	public static void main(String[] args) {
	
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random() * 45 + 1);
			}
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length+1; j++) {
				if(lotto[i] == lotto[j]) {
					
				}
			}
			System.out.println(lotto[i]);
		}
		
		// 로또 번호 생성 및 추가
		for(int i=0; i<lotto.length; i++) {
			
		}
		
		
		// 오름 차순 정렬 - 버블 정렬
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length-1-i; j++) {
				if(lotto[j] < lotto[j+1]) {
					int t = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = t;
				}
			}
		}
		
		// 출력
		
		
		
		
		
		
	}
		
}

