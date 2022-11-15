package sec02.exercise;
import java.util.Scanner;
public class exercise06 {

	public static void main(String[] args) {
		//학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하라
		
		boolean run = true;
        int studentNum = 0;
        int scores[] = null;
        int sum = 0;
        int scoreMax = 0;
        Scanner scanner = new Scanner(System.in);
        
        while(run) {
        	System.out.println("--------------------------------------------------------");
        	System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        	System.out.println("--------------------------------------------------------");
        	System.out.println("선택> ");
        	
        	int selectNo = Integer.parseInt(scanner.nextLine());
        	
        	if(selectNo == 1 ) {
        		// 작성 위치
        		System.out.println("학생수> ");
        		studentNum = Integer.parseInt(scanner.nextLine());
        		scores = new int[studentNum]; //배열의 길이를 학생수만큼 지정해줘야함
        	} else if(selectNo == 2) {
        		// 작성 위치
        		for(int i=0; i<studentNum; i++) {
        			System.out.println("scores[" + i + "]> ");
        			scores[i] = Integer.parseInt(scanner.nextLine());
        		}
        	} else if(selectNo == 3) {
        		// 작성 위치
        		for(int i=0; i<studentNum; i++) {
        			System.out.println("scores[" + i + "]> " + scores[i]);
        		}
        	} else if(selectNo == 4) {
        		// 작성 위치
        		for(int i=0; i<studentNum; i++) {
        			sum += scores[i];
        		}
        		for(int i=0; i<studentNum; i++) {
        			if(scoreMax<scores[i]) {
        				scoreMax = scores[i];
        			}
        		}
        		double avg = (double) sum / studentNum;
        		System.out.println("최고 점수: " + scoreMax);
        		System.out.println("평균 점수: " + avg);
        	} else if(selectNo == 5) {
        		run = false;
        	}
        }
        System.out.println("프로그램 종료");

	}

}
