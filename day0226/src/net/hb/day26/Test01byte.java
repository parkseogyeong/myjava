package net.hb.day26;

public class Test01byte {

	public static void main(String[] args) {
		//29페이지 자바에서 byte=1Byte*8bit -128~127사이 정수숫자기억
		//인텔cpu는 인텔 int형으로 인식
		byte bvalue1=78;
		byte bvalue2=65;
		System.out.println(bvalue1+" "+bvalue2);
		System.out.println("합계="+(bvalue1+bvalue2));
		//byte bvalue3=bvalue1+bvalue2;
		//byte bvalue3=0;
		byte bvalue3=(byte)(bvalue1+bvalue2);
		System.out.println("합계="+(bvalue3));
		//29페이지 자바에서 int=4Byte*8bit=32bit
		//29페이지 자바에서 double=8Byte*8bit=64bit
		//29페이지 자바에서 boolean=8Byte*8bit=64bit
		//29페이지 자바에서 char=8Byte*8bit=64bit
		//char타입 int타입 서로 변환가능
	}//end

}//class END
