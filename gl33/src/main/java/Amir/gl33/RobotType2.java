package Amir.gl33;

public class RobotType2 extends Robot {

	public RobotType2(int x, int y, Direction dir) {
		super(x, y, dir);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void avancer() {
		switch (this.dir) {
		case NORD : 
			this.pos.setY(this.pos.getY() + 10);
			break;
		case EST :
			this.pos.setX(this.pos.getX() + 10);
			break;
		case SUD :
			this.pos.setY(this.pos.getY() - 10);
			break;
		case OUEST :
			this.pos.setX(this.pos.getX() - 10);
			break;
		}
	}
}
