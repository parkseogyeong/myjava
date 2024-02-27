package net.hb.day22;

public class Work02max {

	public static void main(String[] args) {
		int a=5, b=9, c=4;
		int temp=0, tmp=0, imsi=0;
		//가장큰수 9출력
		if(a>b) {temp=a;}//처리못함
		if(b>c) {temp=b;}//처리가능
		if(c>temp) {temp=c;}//처리못함
		System.out.println("최대값="+temp);
	}//end
}//class END