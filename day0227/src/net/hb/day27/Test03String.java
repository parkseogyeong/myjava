package net.hb.day27;

public class Test03String {
	public static void main(String[] args) {
		char data[]= {'k','i','m'};//배열로 한글자씩 지정후 String에 넘김
	    String  a = new String("kim");
		String  str = new String(data);
		String  b = "kim";//가장많이 사용
		
		System.out.println("처음"+a);
		System.out.println("두번"+b);
		System.out.println("정석"+str);

	}//end
}//class END
