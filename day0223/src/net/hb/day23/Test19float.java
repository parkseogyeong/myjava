package net.hb.day23;

public class Test19float {
	public static void main(String[] args) {
		//자바언어에서 실수는 double=8Byte float=4Byte
		float avg=78.9f; //소숫점명시하면 자동=기본 double인식 8byte인식 float는 4byte
		float pi=3.141592f; //소숫점명시하면 자동=기본 double인식 8byte인식 float는 4byte
		
		System.out.println("평균"+avg);
		System.out.println("파이"+pi);
		System.out.println();
		
		//double myavg=23.9;
		//double mypi=23.141592;
		
		//System.out.println("평균"+myavg);
		//System.out.println("파이"+mypi);
		//System.out.println();
	}//end
}//class END
