package net.hb.day22;

public class Work01if {

	public static void main(String[] args) {
		int a=9, b=12, c=4;//적은숫자출력 출력9 8 4
		//반칙 System.out.println(c+""+a+""+b);
		//if(조건{}else if(조건){}else if(조건){}else{}
		//나중에 배열로 소트처리
		if (a>b) {//a변수 제일 큰 경우
			if(b>c) {System.out.println(a+""+b+""+c);}
			else {System.out.println(a+""+c+""+b);}
		}else if(a<b) {//b변수가 더큰수 b=12 
			//System.out.println(a+"숫자가"+b+"보다 적어요");
			if(b>c) {System.out.println(b+""+a+""+c);}// 12>4
			else if (c>a){System.out.println(b+""+c+""+a);}
		}
	}//end
}//class END