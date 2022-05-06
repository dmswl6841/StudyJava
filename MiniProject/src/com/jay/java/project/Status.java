package com.jay.java.project;

public class Status {
	
	//필드
	String name;
	int hp;	//체력
//	int defense;	//방어력 사용할지 고민중
	int maxHp;
	int att;	//공격력
	int gold;	//골드, 소지금
	int exp;		//경험치
	int level;	//레벨
//	Item[]items;
	
	//생성자
	public Status() {
		
	}
	public Status(String name, int hp, int maxHp, int att, int gold, int exp, int level) {
		super();
		this.name = name;
		this.hp = this.maxHp;
		this.maxHp = maxHp;
		this.att = att;
		this.gold = gold;
		this.exp = 0;
		this.level = 1;
		
	}
	
	//메소드
	
	//상태창
	public void shwInfo() {
		System.out.println("================================");
		System.out.println("-----------상  태  창------------");
		System.out.println("이름 : "+ name);
		System.out.println("레벨 : "+ level);
		System.out.println("체력 : "+hp +"/"+ maxHp);
		System.out.println("경험치 : "+ exp  +  "/ 100");
		System.out.println("소유 골드 : " + gold);
		System.out.println("================================");
	}
	
	
	
}
