/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Vihan De Silva
 */
public class EnemyTank implements EnemyAttacker {

    @Override
    public void fireWeapon() {
        System.out.println("TANK FIRES WEAPON");
    }

    @Override
    public void driveForward() {
        System.out.println("TANK DRIVES FORWARD");
    }

    @Override
    public void assignDriver(String name) {
        System.out.println("Driver: " + name);
    }
    
}
