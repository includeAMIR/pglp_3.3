package Amir.gl33;

public class Position {
	private int x;
	int y;
	Position(int x, int y){
		this.setX(x);
		this.y = y;
	}
	public int getY() {
		return this.y;
	}
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}
