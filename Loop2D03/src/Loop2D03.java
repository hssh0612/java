// 문제3) 정수 1개를 입력하여, "*"기호로 좌하변이 직각인 직각삼각형을 출력하시오.
// if문을 사용하지 않고, 중첩 반복문 만을 사용하여 작성.
/*
< 입력 화면 >
길이 입력: 5

< 출력 화면 >
*
**
***
****
*****

*/


import java.util.Scanner;

public class Loop2D03 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("길이 입력: ");
      int n = sc.nextInt();
      
      // 1번
      /*
      for(int i=1; i<=n; i++) {
         for(int j=1; j<=i; j++) {
            System.out.print('*'); // j의 개수가 i의 영향을 받는다.
         }
         System.out.println();
      }
      */
      
      // 2번 - if문 사용 
      for(int i=1; i<=n; i++) {
    	  for(int j=1;j<=n;j++) {
    		  if(j<=i) {
    			  System.out.print("*");
    		  }
    	  }
    	  System.out.println();
      }
      
      sc.close();
   }

}