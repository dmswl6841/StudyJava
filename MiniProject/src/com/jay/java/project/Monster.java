package com.jay.java.project;

public class Monster {
	
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
	
	public Monster(String name, int hp, int maxHp, int att, int gold, int exp, int level) {
		super();
		this.name = name;
		this.hp = this.maxHp;
		this.maxHp =30*level;
		this.att = (int)(Math.random()*level*5);;
		this.gold = (int)(Math.random()*level*15);
		this.exp = (int)(Math.random()*level*5);
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
	
	//전투
	public void attack(User u) {
		int att = (int)(Math.random()*level*5);
		System.out.println(u.name + "에게 "+att+"의 데미지를 입혔습니다!");
		
	}
}
