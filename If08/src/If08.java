// 문제 8) 연령에 따라 놀이공원의 입장료를 출력하는 프로그램 작성
// 조건 : 취학전 아동(8세미만)은 1000, 초등학생(14세 미만)은 2000원, 중고등학생(20세미만)은 3000
// 일반(20세 이상)은 5000원 계산
// 0세 이하는 입력하지 않는 것으로 간주하여 작성
// 제시하는 변수를 사용하여 프로그램을 작성
// 변수명 : age, grade, charge

import java.util.Scanner;

public class If08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객의 나이를 입력하시오 : ");
		int age = sc.nextInt();
		int charge;
		String grade="";
		
		if(age<8) {
			grade = "취학전아동";
			charge = 1000;
			System.out.printf("당신은 %s에 해당합니다.\n입장료는 %d원입니다.",grade,charge);
		} else if(age<14) {
			grade = "초등학생";
			charge = 2000;
			System.out.printf("당신은 %s에 해당합니다.\n입장료는 %d원입니다.",grade,charge);
		} else if(age<20) {
			grade = "중고등학생";
			charge = 3000;
			System.out.printf("당신은 %s에 해당합니다.\n입장료는 %d원입니다.",grade,charge);
		} else if(age>=20) {
			grade = "일반";
			charge = 5000;
			System.out.printf("당신은 %s에 해당합니다.\n입장료는 %d원입니다.",grade,charge);
		}
		
		sc.close();
		
	}
}
