/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Vihan De Silva
 */
public class HexObserver extends Observer {
    
   @Override
   public void update() {
      System.out.println( "Hexal String: " + Integer.toHexString(subject.getState() ) ); 
   }    
}
