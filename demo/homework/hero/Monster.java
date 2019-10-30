package com.rimi.project.homework.hero;

import java.util.Random;

public class Monster {

	// 怪物名称，有普通怪和精英牛莫怪两种
	private String name;
	
	// 怪物的血量
	private int bloor;
	
	// 怪物经验
	private int experience;

	
	public Monster() {
		Random random = new Random();
		
		int isJinYin = random.nextInt(100);
		
		if(isJinYin < 20) {
			// 精英怪
			this.name = "精英牛莫怪";
			this.bloor = random.nextInt(21) + 150;
			this.experience = 200;
		} else {
			this.name = "普通怪";
			this.bloor = random.nextInt(11) + 50;
			this.experience = 60;
		}
	}
	
	public void attacked(int decBloor) {
		
		if(bloor - decBloor >= 0) {
			this.bloor -= decBloor;
		} else {
			// 血不够直接清零
			this.bloor = 0;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBloor() {
		return bloor;
	}

	public void setBloor(int bloor) {
		this.bloor = bloor;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
}
