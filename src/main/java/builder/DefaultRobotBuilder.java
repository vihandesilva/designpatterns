/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 * Builds default robot object on default values
 * @author Vihan De Silva
 */
public class DefaultRobotBuilder implements IRobotBuilder {
	
	private Robot robot;
	
	public DefaultRobotBuilder() {
		robot = new Robot();
	}


	@Override
	public void setName() {
		robot.setRobotName("Default Bot");
		
	}

	@Override
	public void buildIq() {
		robot.setIq(100);
		
	}

	@Override
	public void setActive() {
		robot.setRobotActive(true);
		
	}

	public Robot getRobot() {
		return robot;
	}
	   
}
