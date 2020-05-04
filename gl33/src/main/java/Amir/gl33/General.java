package Amir.gl33;

import java.util.ArrayList;
import java.util.List;

public class General {
	private List<Robot> legion;
	public General() {
		this.legion = new ArrayList<Robot>();
	}
	public void ajouterRobot(Robot rob) {
		this.legion.add(rob);
	}
	public void avancerTous() {
		for (int i=0; i<legion.size(); i++) {
			this.legion.get(i).avancer();
		}
	}
}
