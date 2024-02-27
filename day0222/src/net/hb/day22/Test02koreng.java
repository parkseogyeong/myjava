package net.hb.day22;

public class Test02koreng {

	public static void main(String[] args) {
		int kor=90, eng=85, total=0;
		double avg=0.0;
		
		total=kor+eng;
        avg=(double)total/2; //87.5
		//가능, 정석 avg=total/2; 87.0
		double myavg=total/2;
		//비권장 int myavg=total/2;
		
		System.out.println("총점="+total);
		System.out.println("평균="+avg);
		System.out.println("평균"+myavg);
	}//end
}//class END