package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author dlsgu
 * @date 2023. 2. 10. 오전 11:37:03
 * @subject ***[시험문제3]*** 2차원 배열, 3차원 배열
 * @content 한 반에 30명인 학생들의 성적 관리
 * 			(이름, 국어, 영어, 수학, 총점, 평균, 등수)
 * 			1) 각각의 학생 정보를 입력: 이름, 국, 영, 수
 * 			2) 총점, 평균, 등수 처리
 * 			3) 학생 정보를 출력
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {

		final int STUDENT_COUNT = 30; // 상수 30 선언
		
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];
		
		int cnt = 0; // 입력받은 학생수를 저장할 변수
		char con = 'y';
		
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("> 이름 국어 영어 수학 정보 입력 ? ");
			name = getName(); // scanner.next();
			kor = getScore(); // scanner.nextInt();
			eng = getScore(); // scanner.nextInt();
			mat = getScore(); // scanner.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			
			names[cnt] = name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;
			
			cnt++;
			
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)(System.in.read());
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		// [등수처리]
		/*
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = 1;
			for (int j = 0; j < ranks.length; j++) {
				if (tots[i] < tots[j]) ranks[i]++;
			}
		}
		*/
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = getRank(i+1,tots);
		}
		
		System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
		
		// 입력받은 모든 학생 정보를 출력
		for (int i = 0; i < cnt; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
					, i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}
		
		// 1~3등 학생의 성적정보(이름/국어/영어/수학/총점/평균/등수) 출력
		System.out.println("[1등 학생 정보]");
		for (int i = 0; i < ranks.length; i++) {
			if (ranks[i] <= 3) {
				System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
						, i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
			}
		}
		
		// [등수 순으로 학생 정보 출력]
		System.out.println("[등수 순서 정렬]");


	}//main
	
	// 특정 학생의 번호를 입력하면 등수를 반환하는 함수 선언
	public static int getRank(int no, int [] tots) {
		// 총점
		int tot = tots[no-1];
		// 모든 학생의 총점 비교 tots 배열
		int rank = 1;
		for (int i = 0; i < tots.length; i++) {
			if (tot < tots[i]) rank++;
		}
		return rank;
	}
	
	public static int getScore() {
		return (int)(Math.random()*101);
	}
	
	public static String getName() {
	      // 성씨  128 개  44032   ~ 55203  임의의 정수 -> char  한글 한 문자
	      char [] nameArr = new char[3];
	      Random rnd = new Random();
	      for (int i = 0; i < nameArr.length; i++) {
	          nameArr[i] = (char)( rnd.nextInt('힣' - '가' + 1) + '가' );
	      }
	      // char [] -> String 변환
	      String name = new String( nameArr );
	      return name;
	   }

}//class
