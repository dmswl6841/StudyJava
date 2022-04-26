package com.yedam.java.Question_2;

public class main {

	public static void main(String[] args) {
//		4) 아래와 같이 출력결과가 나오도록 실행코드를 구현한다.
//		- 출력결과
//			NOTEBOOK_MODE
//			한글2020을 통해 문서를 작성.
//			영화를 시청.
//			TABLET_MODE
//			안드로이드앱을 실행.
//			크롬을 통해 인터넷을 검색.
		
		PortableNotebook pn = new PortableNotebook("한글2020","크롬","영화","안드로이드");
		
		pn.mode();
		pn.writeDocumentaion();
		pn.watchVideo();
		pn.changeMode();
		pn.useApp();
		pn.searchInternet();
		
		
		
	}

}
