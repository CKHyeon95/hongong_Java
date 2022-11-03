package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8; // 8,9,10,11
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");	
		}
	
		
		// break가 없으면 랜덤 값 이후의 케이스를 쭉 실행
	}

}
