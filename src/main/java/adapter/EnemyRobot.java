/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.Random;

/**
 *
 * @author Vihan De Silva
 */
public class EnemyRobot {
    
    private Random generator = new Random();
    
    public void punch(){
        int damage = generator.nextInt(101);
        System.out.println("Punch damage: " + damage);
    }
    
    public void walk(){
        int distance = generator.nextInt(101);
        System.out.println("Walk distance: " + distance);
    }
    
    public void attackHuman(String name){
        System.out.println("Attacks human target name: " + name);
    }
}
