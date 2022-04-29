package com.yedam.java.ch02;

public class PortableNotebook implements Notebook, Tablet {

	private int mode;
	private String writeDocumentaion;
	private String searchInternet;
	private String watchVideo;
	private String useApp;
	
	public PortableNotebook(String writeDocumentaion, String searchInternet, String watchVideo, String useApp,int mode) {
		super();
		this.writeDocumentaion = writeDocumentaion;
		this.searchInternet = searchInternet;
		this.watchVideo = watchVideo;
		this.useApp = useApp;
		this.mode = NOTEBOOK_MODE;
	}
	@Override
	public void watchVideo() {
		System.out.println(watchVideo +"를 시청.");
	}

	@Override
	public void useApp() {
		if(this.mode == Notebook.NOTEBOOK_MODE) {
			changeMode();
		}
		System.out.println(useApp + "을 실행");
	}

	@Override
	public void writeDocumentaion() {

	}

	@Override
	public void searchInternet() {
		System.out.println(searchInternet+"를 통해 인터넷을 검색.");

	}
	
	public void changeMode() {
		if(this.mode == Notebook.NOTEBOOK_MODE) {
			this.mode = Tablet.TABLET_MODE;
			System.out.println("현재 모드 : TABLET_MODE");
		}
		else if(this.mode == Tablet.TABLET_MODE) {
			this.mode = Notebook.NOTEBOOK_MODE;
			System.out.println("현재 모드 : NOTEBOOK_MODE");
		}
	}

}
