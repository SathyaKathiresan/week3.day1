package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student Name");
	}
	public void studentDept() {
		System.out.println("Department");
	}
	public void studentId() {
		System.out.println("ID");
	}
	
	public static void main(String[] args) {
		Student objStu = new Student();
		objStu.collegeName();
		objStu.collegeCode();
		objStu.collegeRank();
		objStu.deptName();
		objStu.studentName();
		objStu.studentId();
		objStu.studentDept();
	}

}
