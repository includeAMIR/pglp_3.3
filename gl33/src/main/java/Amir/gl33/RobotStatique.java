package Amir.gl33;

public class RobotStatique extends Robot {

	public RobotStatique(final int x, final int y, Direction dir) {
		super(x, y, dir);
	}

	@Override
	public void avancer(Direction dir) {
		throw new UnsupportedOperationException();
	}
}
