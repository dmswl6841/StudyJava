package com.yedam.java.ch11_02;

import java.io.UnsupportedEncodingException;

public class StringGetByExample {
	
	public static void main(String[] args) {
	 //String 생성자 : Byte타입 -> String 타입 디코딩 : 사람이 인식 할 수 있도록
	 //getBytes 메소드 : String타입 -> byte타입 인코딩 : 기계가 인식 할 수 있도록
	 
	 String str = "안녕하세요";
	 
	 byte[]	Byetes1 = str.getBytes();
	 System.out.println(Byetes1);
	 String str1 = new String(Byetes1);
	 System.out.println(str1);
	 
	 try {
		 byte[] bytes2 = str.getBytes("EUC-KR");
		 System.out.println("bytes2.length : "+bytes2.length);
	 }catch(UnsupportedEncodingException e){
		 
	 }
	 
 }
}
