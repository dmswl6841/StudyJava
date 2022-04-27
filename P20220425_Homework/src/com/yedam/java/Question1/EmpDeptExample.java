package com.yedam.java.Question1;

public class EmpDeptExample {

	public static void main(String[] args) {
//		이름:이지나  연봉:3000  부서:교육부
//		수퍼클래스
//		서브클래스
		
//		EmpDept emp = new EmpDept();
//		emp.name = "이지나";
//		emp.salary = 3000;
//		emp.Dept = "교육부";
//		
//		emp.getInformation();
//		emp.print();
		
		EmpDept emp = new EmpDept("이지나", "교육부", 3000);
		emp.getInformation();
		emp.print();
		
	}

}
