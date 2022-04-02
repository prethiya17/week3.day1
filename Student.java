package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Entering into studentName Method");
	}
	
	public void studentDept() {
		System.out.println("Entering into studentDept Method");
	}
	
	public void studentId() {
		System.out.println("Entering into studentId Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();

	}

}
