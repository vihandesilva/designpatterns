/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vihan De Silva
 */
public class RunnableExample implements Runnable {
    
    @Override
    public void run() {
        log();
    }
    
    private void log(){
        
        for(int i=0; i<=10; i++){
            System.out.println("Runnable Example is running to the count of " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RunnableExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
}
