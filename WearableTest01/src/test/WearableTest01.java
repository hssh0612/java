package test;

import player.CDPlayer;
import player.Player;
import player.VideoPlayer;
import wearable.Color;
import wearable.Wearable;
import wearable.WearableComputer;
import wearable.WearableRobot;

// 문제 3) Wearable 인터페이스를 구현한 클래스의 인스턴스를 각 2개씩 배열에 담아서, 다형성을 구현하여 출력
// 
public class WearableTest01 {
	public static void main(String[] args) {
		// 인스턴스 배열 1번
		/*
		Wearable[] wearables = new Wearable[4];
		wearables[0] = new WearableComputer("dddd");
		wearables[1] = new WearableRobot(Color.RED);
		wearables[2] = new WearableComputer("gggg");
		wearables[3] = new WearableRobot(Color.BLUE);
		*/
		// 인스턴스 배열 2번
		
		Wearable[] wearables = new Wearable[] {
				new WearableComputer("dddd"),
				new WearableRobot(2),
				new WearableComputer("gggg"),
				new WearableRobot(1),
		};
		
		
		// 출력 1번 - 기본 for문
		for(int i=0; i<wearables.length; i++) {
	         wearables[i].putOn();
	         wearables[i].putOff();
	         if(wearables[i] instanceof Color) {
	            ((Color)wearables[i]).changeColor(Color.GREEN);
	         }
	         wearables[i].putOn();
	         wearables[i].putOff();
	         System.out.println();
		}
		// 출력 2번 - 확장for문
		
		for(Wearable w: wearables) {
			
		}
	}
}
