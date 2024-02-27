package net.hb.day26;

public class Test09print {
	public static void main(String[] args) {
		System.out.printf("Test09프린트문서\n");
		
		System.out.printf("|%10d| |%f| %c %s\n", 78, 3.141592, 'B', "kim");
		System.out.printf("|%6d| |%f| %c %s\n", 78, 3.141592, 'B', "kim");
		System.out.printf("|%d| |%f| %c %s\n", 78, 3.141592, 'B', "kim");
		System.out.println();//<br>태그같은역할 라인개행
	}//end
}//class END
