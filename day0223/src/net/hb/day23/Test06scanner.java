package net.hb.day23;

import java.lang.System;
import java.lang.System;
import java.util.Scanner;

public class Test06scanner {
	public static void main(String[] args) {
		int dan=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("원하는 단 입력");
		dan=scan.nextInt(); // 9, 10, 11, 12는 무조건 세트
		for(int i=0; i<10; i=i+1) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		scan.close();
		//자바의 기본클래스는 java.language패키지 포함되어 있으면 import생략가능
		//1번째 자바에서 키보드입력 Scanner클래스 이용 java.util패키지소속 Scanner클래스
	    //2번째 보통 객체=Object화 new키워드 Scanner scan=new Scanner(System.in);
		//3번째 안내문 변수= scan.nextInt() 변수= scan.nestLine()
	}//end
}//class END
