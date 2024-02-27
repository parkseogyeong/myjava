package net.hb.day23;

public class Test15break {
	public static void main(String[] args) {
		//break, continue
		boolean boolflag=false;
		String name="kim";
		int age=23;
		//break; //loop반복 아니면 switch제어문
		//continue; //loop반복
		//return true; //자바에서 return 문장은 마지막에 기술 권장
		if(boolflag==false) {
		System.out.printf("이름=%s 나이=%d\n", name, age);//f가 들어가면 반드시 서식을 넣어줘야함, 역슬래시n이 라인개행
		System.out.println("이름="+name+"나이"+age);
		System.out.println("Test15 마지막문장 출력");
		}
	}//end
}//class END
