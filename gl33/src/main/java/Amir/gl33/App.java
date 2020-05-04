package Amir.gl33;

/**
 * Hello world.
 */
public class App {
	public static void main(String[] args) {
		//Robot r = new RobotStatique(2, 4, Direction.NORD);
		Robot r1 = new RobotType1(2,2,Direction.NORD);
		Robot r2 = new RobotType2(2,2,Direction.SUD);
		Robot rs = new RobotStatique(2,2,Direction.NORD);
		General G = new General();
		G.ajouterRobot(r1);
		G.ajouterRobot(r2);
		G.ajouterRobot(rs);
		G.avancerTous();
		r1.PrintPos();
		r2.PrintPos();
		rs.PrintPos();
	}
}