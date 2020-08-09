/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vd.singleton;

/**
 *
 * @author Vihan De Silva
 */
public class Singleton {
    private static volatile Singleton instance;
    
    private static class Holder{
        public static Singleton eagerSingleton = new Singleton();
    }
    
    private Singleton(){
        
    }
   
    // Classic ThreadSafe lazy singleton initialization
    public static Singleton getSingletonLazy(){
        
        if(instance == null){
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        
        return instance;
    }
    
    //Eager initialization - singleton design pattern
    public static Singleton getSingletonEager(){
        return Holder.eagerSingleton;
    }
    
    
    
}

