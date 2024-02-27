package net.hb.day26;

public class Test03char {

	public static void main(String[] args) {
		//int, char 타입은 ascii코드인식=Amarican Standard cord for Information Interchange
		//char연산을 하면 ascii코드값 연산
		char hap='c';//99
		char tot='0';//48
		System.out.println(hap+""+tot+"");
		int kor=(int)hap;//char타입 int형변환은 자동으로 아스키코드값
		int eng=(int)tot;
		System.out.println(kor+""+eng+"");	
		char x=(char)kor;
		char y=(char)eng;
		System.out.println(x+""+y+"");
	}//end

}//class END
