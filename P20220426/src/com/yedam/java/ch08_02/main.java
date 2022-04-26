package com.yedam.java.ch08_02;

public class main {

	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		
		interfaceA ia = imp;
		ia.methodA();
//		ia.methodB();			에러

		interfaceB ib = imp;
		ib.methodB();

		interfaceC ic = imp;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
