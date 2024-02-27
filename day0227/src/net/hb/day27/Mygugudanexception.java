package net.hb.day27;

import java.util.Scanner;

public class Mygugudanexception {
	public static void main(String[] args) {
		int kor=78;//자바에서 null값은 클래스타입, interface타입
		char flag='b';//char타입은 무조건 싱싱
		int dan=1;
		Scanner scan=null;
		try {
		System.out.print("단 입력");
		dan=scan.nextInt();//블럭변수
		}catch(Exception ex) {}
		for(int i=0; i<10; i=i+1) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		int a=9, b=5;
		int hap=0, nmg=0;
		double mok=0.0;
		
		try {
		hap=a+b;
		mok=(double)a/b;
		nmg=a%b;
		}catch(Exception e) {System.out.println("에러이유"+e);}
		
		System.out.println();//<br>역할
		System.out.println("몫="+mok);
		System.out.println("나머지="+nmg);
		System.out.println("합="+hap);
		System.out.println("마지막처리 필수");
	}//end
}//class END
