/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Vihan De Silva
 */
public class Main {
    
    public static void main(String[] args) {
        //Create new thread variable passing thread and runnable types as parameters
        Thread threadextender = new Thread(new ThreadExtender());
        Thread runnableExample = new Thread(new RunnableExample());
        
        //Create an anonymous Thread class overriding the Thread.run() method
        Thread anonymousRunner = new Thread(new Thread() {
        											public void run() { 
        												System.out.print("SAS"); 
        											} 
        										}
        									);
        
        
        // Invokes the overriden run method in the provided thread or runnable type
        anonymousRunner.start();
        threadextender.start(); 
        runnableExample.start();
        
    }
}
