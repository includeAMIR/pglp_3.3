package Amir.gl33;

/**
 * Hello world.
 */
public class App {
	public static void main(String[] args) {
		Robot r = new RobotStatique(2, 4, Direction.NORD);
		System.out.print(r.getPos().getX());
	}
}