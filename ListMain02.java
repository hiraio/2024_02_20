package edu.java.collection02;

import java.util.ArrayList;

class Student{
	// 멤버 변수
	private int stuNo;
	private String name;
	
	public Student() {} // 기본 생성자
	
	public Student(int stuNo, String name) { // 매개변수가 있는 생성자
		this.stuNo = stuNo;
		this.name = name;
	}

	@Override
	public String toString() { // toString()으로 출력
		return "Student [stuNo=" + stuNo + ", name=" + name + "]";
	}
	
}



public class ListMain02 {
	
	

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		// 앞 ArrayList<Integer> 와 뒤 ArrayList<Integer>는 같은 말 , 뒤에 Integer는 생략가능 
		list1.add(100);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("test");
		
		// Student 타입을 지정할 수 있는 ArrayList 인스턴스 생성
		ArrayList<Student> list3 = new ArrayList<>();
	
		list3.add(new Student(1, "kim")); // 1 
		Student stu1 = new Student(2, "park"); // 2 
		list3.add(stu1); // 2 
		
		
		// 1과 2 과정은 동일하다. 클래스를 불러와야하기 때문에 인스턴스를 생성해야함 SO, new를 사용
		
		for(int i =0; i < list3.size(); i ++) {
			System.out.println(list3.get(i)); 
			// get이 Student 클래스에 있는 값을 불러오는건데, Student 클래스에 출력하는 메소드가 한 개 이기에 그것을 출력
		}
	} // end main()

} // end ListMain02









