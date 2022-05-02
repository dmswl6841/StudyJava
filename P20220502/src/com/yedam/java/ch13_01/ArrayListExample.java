package com.yedam.java.ch13_01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Datebase");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체 수  : "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println("");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);	//0:Java	1:JDBC	2:Datebase	3:Servlet/JSP	4:iBATIS	->2:Datebase가 삭제
		list.remove(2);	//0:Java	1:JDBC	2:Servlet/JSP	3:iBATIS	-> 2:Servlet/JSP가 삭제
		list.remove("iBATIS");	//0:Java	1:JDBC	2:iBATIS	->2:iBATIS가 삭제
								//결과적으로 0:Java	1:JDBC가 출력
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		
	}

}
