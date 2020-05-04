package Amir.gl33;

public class RobotType1 extends Robot {

	public RobotType1(int x, int y, Direction dir) {
		super(x, y, dir);
	}
	@Override
	public void avancer() {
		switch (this.dir) {
		case NORD : 
			this.pos.setY(this.pos.getY() + 1);
			break;
		case EST :
			this.pos.setX(this.pos.getX() + 1);
			break;
		case SUD :
			this.pos.setY(this.pos.getY() - 1);
			break;
		case OUEST :
			this.pos.setX(this.pos.getX() - 1);
			break;
		}
	}
}
