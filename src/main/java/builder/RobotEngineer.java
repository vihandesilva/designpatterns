/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Vihan De Silva
 */

//RobotEngineer calls the RobotBuilder class and activates it.
public class RobotEngineer {
    
    IRobotBuilder builder;
    
    public RobotEngineer(IRobotBuilder builder){
        this.builder = builder;
    }
}
