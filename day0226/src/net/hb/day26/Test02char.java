package net.hb.day26;

public class Test02char {

	public static void main(String[] args) {
		//int, char 타입은 ascii코드인식=Amarican Standard cord for Information Interchange
		//char연산을 하면 ascii코드값 연산
		char a='a';//97
		char b='2';//50
		System.out.println(a+b);//147
		//System.out.println(a+b+c);//150
		System.out.println(a+""+b+"");//a2
		//System.out.println(a+""+b+""+c);//123
		System.out.println("char타입연산 아스키코드");
		System.out.println();
		int x=(int)a;//char타입 int형변환은 자동으로 아스키코드값
		int y=(int)b;
		System.out.println(x+""+y+"");
		//29페이지 자바에서 int=4Byte*8Byte=32Byte
		//29페이지 자바에서 char=2Byte*8Byte=16Byte		

	}//end

}//class END
