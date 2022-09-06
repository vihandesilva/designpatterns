/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 * Blueprint for Robot Builder
 * @author Vihan De Silva
 */
public interface IRobotBuilder {
    public void setName();
    
    public void buildIq();
    
    public void setActive();
    
    public Robot getRobot();
}
