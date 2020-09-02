/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * EnemyRobotAdapter to fit in with EnemyAttacker interface
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot robot;
    
    public EnemyRobotAdapter(EnemyRobot robot){
        this.robot = robot;
    }
    
    @Override
    public void fireWeapon() {
        this.robot.punch();
    }

    @Override
    public void driveForward() {
        this.robot.walk();
    }

    @Override
    public void assignDriver(String name) {
        this.robot.attackHuman(name);
    }
    
}
