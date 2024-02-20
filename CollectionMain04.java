package edu.java.collection04;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CollectionMain04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name ;
		int mathscore ;
		int englishscore;
		
		List<Student> list = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			name = sc.next();
			mathscore = sc.nextInt();
			englishscore = sc.nextInt();
			
			// 학생 정보(이름, 점수) 3개 입력받아 list에 저장 -add
			
			list.add(new Student(name,new Score(mathscore, englishscore)));
		}
		
		// 전체 데이터 검색(출력) - get
		
		for(Student x : list) {
			System.out.println(x);
		}
		
		// 데이터 수정 - set
		// - 1번 인덱스의 학생 정보를 변경
		// 예시) 이름 : 둘리
		//		수학 : 100
		// 		영어 : 50
		name = sc.next();
		mathscore = sc.nextInt();
		englishscore = sc.nextInt();
		
		list.set(1, new Student(name,new Score(mathscore, englishscore))); // 이 구조를 이해하는 게 *point*
		for(Student x : list) {
			System.out.println(x);
		}
		
		
		// 0번 인덱스 학생의 영어점수만 변경 - 
			englishscore = sc.nextInt();
			list.get(0).getScore().setEng(englishscore);
			
		
		// 변경된 리스트의 모든 데이터 출력 - get(index)
			for(Student x : list) {
				System.out.println(x);
			}
				
			
		// 데이터 삭제 : 1번 인덱스 학생의 모든 정보 삭제 - remove(index)
				list.remove(1);
			
				for(Student x : list) {
					System.out.println(x);
				}
					
				sc.close();
	} // end main()
	
} // end CollectionMain04


