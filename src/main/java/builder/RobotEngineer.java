/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Vihan De Silva
 *
 * RobotEngineer uses a Robot Builder Type  and creates an instantiated robot object
 */
public class RobotEngineer {
    
    IRobotBuilder builder;
    
    public RobotEngineer(IRobotBuilder builder){
        this.builder = builder;
    }
    
    public void createRobot() {
    	this.builder.buildIq();
    	this.builder.setName();
    	this.builder.setActive();
    }
    
    public Robot getRobot() {
    	return this.builder.getRobot();
    }
}
