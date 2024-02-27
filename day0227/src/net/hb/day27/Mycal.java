package net.hb.day27;

public class Mycal {

	public static void main(String[] args) {
		int a=7, b=4;
		int hap=0, nmg=0;
		double mok=0.0;
		
		try {
		hap=a+b;
		mok=(double)a/b;
		nmg=a%b;
		}catch(Exception e) {System.out.println("에러이유"+e);}
		
		System.out.println("몫="+mok);
		System.out.println("나머지="+nmg);
		System.out.println("합="+hap);
		System.out.println("화요일 출제");
	}//End
}//Class End
