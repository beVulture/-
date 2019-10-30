package com.rimi.project.homework.pushbox;

/**
 *  管理游戏地图
 * @author admin
 *
 */
public class Map {

	public String[][] map;
	
	Point person;
	
	Point box;
	
	Point door;
	
	// 初始化地图
	public void init(String[][] map) {
		this.map = map;
		
		person = new Point();
		box = new Point();
		door = new Point();

		for(int indexX = 0; indexX < map.length; indexX++) {
			
			for(int indexY = 0; indexY < map[indexX].length; indexY++) {
				if(map[indexX][indexY] == "O") {
					box.x = indexX;
					box.y = indexY;
				}
				if(map[indexX][indexY] == "R") {
					person.x = indexX;
					person.y = indexY;
				}
				
				if((indexX == 0 || indexX == map.length -1 
						|| indexY == 0 || indexY == map[indexX].length - 1)
						&& map[indexX][indexY] == " ") {
					// 判断第一行或者最后一行或者第一列或者最后一列，哪一个为空白，一定是门
					door.x = indexX;
					door.y = indexY;
				}
			}
		}
	}
	
	/**
	 *  移动情况有2种
	 *   "R"" " 不需要考虑箱子，直接移动 	” “”R“
	 *   "R""O"" "  箱子和人一起移动		" ""R""O"
	 */
	public void MoveLeft() {
		/*
		 *  寻找下一个和下下个
		 */
		Point next = person.getLeft();
		Point nextNext = next.getLeft();
		exchange(next, nextNext);
	}
	
	public void MoveRight() {
		Point next = person.getRight();
		Point nextNext = next.getRight();
		exchange(next, nextNext);
	}
	
	public void MoveUp() {
		
		Point next = person.getUp();
		Point nextNext = next.getUp();
		exchange(next, nextNext);
		
	}
	
	public void MoveDown() {
		Point next = person.getDown();
		Point nextNext = next.getDown();
		exchange(next, nextNext);
	}
	
	/**
	 *  用户不能任意交换格子，用户只能按上下左右
	 */
	private void exchange(Point next, Point nextNext) {
		/**
		 *  移动情况有2种
		 *   "R"" " 不需要考虑箱子，直接移动 	” “”R“
		 *   "R""O"" "  箱子和人一起移动		" ""R""O"
		 */
		if(isAvliable(next)) {
			
			if(map[next.x][next.y] == " ") {
				// 如果next可用，并且next是空白，则直接走一步
				map[person.x][person.y] = " ";
				map[next.x][next.y] = "R";
				// 更新人的最新位置
				person = next;
			} else if(map[next.x][next.y] == "O"){
				// next不是空白，而是箱子,则考虑下下个是不是空白
				
				if(isAvliable(nextNext)) {
					if(map[nextNext.x][nextNext.y] == " ") {
						// 下下个是不是空白 也是空白
						
						map[person.x][person.y] = " ";
						map[box.x][box.y] = "R";
						map[nextNext.x][nextNext.y] = "O";
						// 更新人的最新位置
						person = box;
						// 更新箱子的最新位置
						box = nextNext;
						
					}
				}
				
			}
			
		}
	}
	
	public boolean isAvliable(Point point) {
		if(point.x >= 0 && point.y >= 0 && point.x < map.length && point.y < map[point.x].length) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 *  判断是否达到出口
	 */
	
	public boolean isArriavl() {
		// 箱子坐标和门的左边相等
		if(door.equals(box)) {
			return true;
		} else {
			return false;
		}
//		return door.equals(box);
	}
	
	/**
	 *  打印地图
	 */
	public void print() {
		for(int indexX = 0; indexX < map.length; indexX++) {
			for(int indexY = 0; indexY < map[indexX].length; indexY++) {
				System.out.print(map[indexX][indexY]);
			}
			
			System.out.println();
		}
	}
}
