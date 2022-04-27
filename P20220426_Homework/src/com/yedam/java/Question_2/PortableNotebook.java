package com.yedam.java.Question_2;

public class PortableNotebook implements Notebook, Tablet {
//	3) PortableNotebook 클래스를 정의한다.
//- Notebook 인터페이스와 Tablet 인터페이스를 구현한 클래스.
//- MODE, 문서 프로그램, 인터넷 브라우저, 영상종류, 앱종류를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//( 단, MODE 필드는 매개변수를 이용하지 않으며 TABLET_MODE를 초기값으로 가지며 현재 모드를 출력해준다. )
//- Notebook 인터페이스와 Tablet 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
//(1) public abstract void writeDocumentaion() : "'문서 프로그램'을 통해 문서를 작성."을 출력한다.
//(2) public abstract void searchInternet() : "'인터넷 브라우저'를 통해 인터넷을 검색."을 출력한다.
//(3) public abstract void watchVideo() : "'영상종류'를 시청."을 출력한다.
//(4) public abstract void useApp() : 
//	- NOTEBOOK_MODE : 현재 모드를 바꾸고 "'앱종류'를 실행."를 출력한다.
//	- TABLET_MODE : "'앱종류'를 실행."을 출력한다.
//(5) public void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( NOTEBOOK_MODE -> TABLET_MODE / TABLET_MODE -> NOTEBOOK_MODE)
	
	private int mode;
	private String writeDocumentaion;
	private String searchInternet;
	private String watchVideo;
	private String useApp;
	
	public PortableNotebook() {
		String nowMode = null;
		if(mode == NOTEBOOK_MODE) {
			nowMode ="NOTEBOOK_MODE";
			System.out.println("현재 모드 : " + nowMode);
		}
		else if(mode == TABLET_MODE) {
			nowMode ="TABLET_MODE";
			System.out.println("현재 모드 : " + nowMode);
		}
	}


	public PortableNotebook(String writeDocumentaion, String searchInternet, String watchVideo, String useApp) {
		super();
		this.writeDocumentaion = writeDocumentaion;
		this.searchInternet = searchInternet;
		this.watchVideo = watchVideo;
		this.useApp = useApp;
	}



	@Override
	public void watchVideo() {
		System.out.println(watchVideo +"를 시청.");
	}

	@Override
	public void useApp() {
		if(mode == NOTEBOOK_MODE) {
			mode =TABLET_MODE;
			System.out.println(useApp+"를 실행.");
		}
		if(mode == TABLET_MODE) {
			System.out.println(useApp+"를 실행.");
		}
	}



	@Override
	public void searchInternet() {
		System.out.println(searchInternet+"를 통해 인터넷을 검색.");

	}
	
	public void changeMode() {
		String nowMode = null;
		if(mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			nowMode ="TABLET_MODE";
			System.out.println("현재 모드 : " + nowMode);
		}
		else if(mode == TABLET_MODE) {
			mode = NOTEBOOK_MODE;
			nowMode ="NOTEBOOK_MODE";
			System.out.println("현재 모드 : " + nowMode);
		}
	}



	@Override
	public void writeDocumentaion() {
		System.out.println(writeDocumentaion +"을 통해 문서를 작성");
	}

}
