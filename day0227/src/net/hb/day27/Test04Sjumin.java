package net.hb.day27;

public class Test04Sjumin {
	public static void main(String[] args) {
		//String jumin=new String("901024-4837629");//정석
		String jumin="901124-4837629";//해법
		char data=jumin.charAt(7);//배열,문자열은 0번째부터시작
		if(data=='1'||data=='3') {
			System.out.println("당신의 성별은 남자입니다");
		}else if(data=='2'||data=='4'){
			System.out.println("당신의 성별은 여자입니다.");
		}else{System.out.println("성별이 이상합니다");}
		//char gender=jumin.charAt(7);//배열,문자열은 0번째부터시작
		//char data=jumin.charAt(7);//배열,문자열은 0번째부터시작
	}//end
}//class END
