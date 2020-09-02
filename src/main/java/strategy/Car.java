/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *  Strategy pattern uses composition over inheritance. Behavior of a class are separate classes.
 *  The behaviour of the class is a composition of other classes.
 *  In this example, the Car class has behaviours such as brake, which is a composition of one or 
 *  more types of brake classes. subclasses of Car class can use any type of brake which implements
 *  Ibrakemode interface.
 */
public abstract class Car{
    Ibrakemode brakemode;
    
    public Car(Ibrakemode brakemode){
        this.brakemode = brakemode;
    }
    
    public void brake(){
        brakemode.brake();
    }
}
