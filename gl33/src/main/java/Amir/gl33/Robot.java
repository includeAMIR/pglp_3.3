package Amir.gl33;

public abstract class Robot {
	protected Position pos;
	protected Direction dir;
	public Robot(int x, int y, Direction dir) {
		this.pos = new Position(x, y);
		this.dir = dir;
	}
	public abstract void avancer(Direction dir);
	public void tourne() {
		switch(this.dir) {
			case NORD : 
				this.dir = Direction.EST;
				break;
			case EST :
				this.dir = Direction.SUD;
				break;
			case SUD :
				this.dir = Direction.OUEST;
				break;
			case OUEST :
				this.dir = Direction.NORD;
		}
	}
	public Position getPos() {
		return this.pos;
	}
}
