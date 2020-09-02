/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Vihan De Silva
 */
public class BrakeNormal implements Ibrakemode {

    @Override
    public void brake() {
        System.out.println("Non-ABS Brake applied");
    }
    
}
