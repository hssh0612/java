/*
날짜 클래스
인스턴스 변수: 년(year), 월(month), 일(date)
인스턴스 메소드: getter, setter, 출력 메소드
생성자

*/
import java.util.Scanner;

class Day {
   // 인스턴스 변수
   private int year;
   private int month;
   private int date;
   
   // 생성자 
   public Day() {
      this.year = year;
      this.month = month;
      this.date = date;
   }
   
   public Day(int year, int month, int date) {
      this.year = year;
      this.month = month;
      this.date = date;
   }
   
   // getter
   public int getYear() {
      return year;
   }
   public int getMonth() {
      return month;
   }
   public int getDate() {
      return date;
   }
   
   // setter
   public void setYear(int year) {
      this.year = year;
   }
   public void setMonth(int month) {
      this.month = month;
   }
   public void setDate(int date) {
      this.date = date;
   }
   
   // 년, 월, 일을 한꺼번에 설정 또는 변경하는 메소드
   public void set(int year, int month, int date) {
      this.year = year;
      this.month = month;
      this.date = date;   
   }
   
   // 요일 계산 메소드
   // 메소드 공식 : 날씨에 따른 요일을 0~6사이의 정수로 구하는 공식.
   // 0: 일, 1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토 
   public int dayOfWeek() {
      int y = year;
      int m = month;
      int d = date;
      
      if(m == 1 || m == 2) {
    	  y--;
    	  m += 12;
      }
      return (y + y/4 - y/100 + y/400 + (13*m+8)/5 +d) % 7;
   }
   

}

public class DayTest01 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   
      System.out.println("생년월일을 입력하시오. : ");
      System.out.print("년 입력 : ");
      int year = sc.nextInt();
      System.out.print("월 입력 : ");
      int month = sc.nextInt();
      System.out.print("일 입력 : ");
      int date = sc.nextInt();
      
      Day birthday = new Day(year, month, date);
      
      // 실제 데이터를 복사한 것이 아니라, 참조만 복사
      // birthday가 참조하는 곳을 xDay도 참조한다.
      // birthday, xDay도 같은 곳을 참조한다.
      Day xDay = birthday ; 
      
      // xDay를 통해서 birthday
      xDay.set(2023, 7, 25);
      
      System.out.printf("birthday = %4d년 %2d월 %2d일\n", birthday.getYear(), birthday.getMonth(), birthday.getDate());
      System.out.printf("xDay = %4d년 %2d월 %2d일\n", xDay.getYear(), xDay.getMonth(), xDay.getDate());
      
      

      
      
      sc.close();
   }

}
