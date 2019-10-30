package com.rimi.project.homework.hero;

import java.util.Random;

public class Hero {

	// 英雄等级
	private int level;
	
	// 英雄当前的经验,随着杀怪不停的增加
	private int currentExperiencce;

	private String findMonsterInfo = "发现一只%s,准备击杀怪物\r\n";
	
	private String congurationInfo = "恭喜你，成功击杀一只%s,经验值上涨%d\r\n";
	
	private String upLevelInfo = "恭喜你，等级提升，当前等级为%d级\r\n";
	
	private String boomAttack =  "你手法超神,技艺精湛,经过%d秒时间发现怪物致命破绽,造成致命一击,怪物剩余生命%d\r\n";
	
	private String normalAttack = "经过%d秒时间发现破绽，砍中怪物,怪物剩余生命%d\r\n";
	
	public Hero() {
		// 初始为0级别，经验为0
		this.level = 0;
		this.currentExperiencce = 0;
	}

	
	// 开始游戏
	public void startGame() {
		
		while(true) {
			// 发现怪物
				// 随机生成一个怪
				Monster monster = new Monster();
				System.out.printf(findMonsterInfo,monster.getName());
			// 击杀怪物
				while(monster.getBloor() > 0) {
					kill(monster);
				}
				
			// 恭喜并查看是否升级
				System.out.printf(congurationInfo, monster.getName(),monster.getExperience());
				addExperience(monster.getExperience());
		}
	}
	
	// 一次攻击
	public void kill(Monster monster) {
		
		// 先决定每多少秒打一次
		Random random = new Random();
		int waitTime = random.nextInt(3) + 1;
		
		// 系统休眠waitTime 秒
		
		try {
			// 使用Thread的sleep方法，可以让当前的线程 停止执行，经过指定的毫秒数之后，重新恢复执行
			Thread.sleep(waitTime * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 当执行到此处时，代表休眠已经结束了
		System.out.println();
		
		// 判断暴击
		int isBoom = random.nextInt(100);
		if(isBoom < 20) {
			// 暴击
			// 怪物扣去暴击血量
			monster.attacked(random.nextInt(11) + 100);
			System.out.printf(boomAttack, waitTime, monster.getBloor());
		}  else {
			// 普通攻击
			monster.attacked(random.nextInt(31) + 10);
			System.out.printf(normalAttack,waitTime,monster.getBloor());
		}
	}
	
	// 给英雄增加经验值
	public void addExperience(int addExperiecne) {
		this.currentExperiencce += addExperiecne;
		// 升级所需经验
		int upNeed = getUpLevelNeed();
		if(currentExperiencce >= upNeed) {
			this.level+=1;
			this.currentExperiencce -= upNeed;
			System.out.println("----------------------------");
			System.out.printf(upLevelInfo, this.level);
			System.out.println("----------------------------");
		}
	}
	
	// 获取升级所需经验
	public int getUpLevelNeed() {
		return (int) (Math.pow(2, level) * 200);
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCurrentExperiencce() {
		return currentExperiencce;
	}

	public void setCurrentExperiencce(int currentExperiencce) {
		this.currentExperiencce = currentExperiencce;
	}
	
	
}
